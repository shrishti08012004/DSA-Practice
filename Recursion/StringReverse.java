public class StringReverse {
    static String reverse(String str){
        //Base case
        if(str.length() == 0){
            return "";
        }
        //Small Problem
        String smallString = reverse(str.substring(1));
        char firstChar = str.charAt(0);
        return smallString + firstChar;
    }
    public static void main(String[] args) {
        String r = reverse("amit");
            System.out.println(r);
        
    }
}
