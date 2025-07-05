public class RemoveConsDup {
    static String removeConsDup(String str){
        //base case
        if(str.length()<=1){
            return str;
        }
        //0 th char 1st char
        if(str.charAt(0)==str.charAt(1)){
            return removeConsDup(str.substring(1));
        }
        else{
            return str.charAt(0)+removeConsDup( str.substring(1));
        }
    }
    public static void main(String[] args) {
      System.out.println(removeConsDup("aaaabbbccddd"));
    }
}
