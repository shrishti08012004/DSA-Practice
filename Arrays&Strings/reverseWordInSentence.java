public class reverseWordInSentence {
    public static void main(String[] args) {
        String str ="I am a Student";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{  // ch == ' '
             sb.reverse();
             ans += sb;
             ans += " ";
             sb = new  StringBuilder("");
            }
        }
        //sb.append(" ");
        sb.reverse();
        ans += sb;
       //System.out.println(sb);
       System.out.println(ans);
    }
}
