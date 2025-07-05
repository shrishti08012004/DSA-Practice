public class AdjStar {
    static String adjStar(String str){
        //Base case
        if(str.length()<=1){
            return str;
        }
         if(str.charAt(0) == str.charAt(1)){
            //Add Asterik
            return str.charAt(0)+"*"+adjStar(str.substring(1));
         }
         else{
            //Don't Add it
            return str.charAt(0)+adjStar(str.substring(1));

         }
    }
    public static void main(String[] args) {
        System.out.println(adjStar("aabbcdd"));
        
    }
}
