import java.util.*;
public class palindromeString {
    public static void main(String[] args) {
        String str = "abcba";
        // StringBuilder gtr = new StringBuilder(str);
        // gtr.reverse();
        // String s = gtr + "";
        // if(str.equals(s)){
        //     System.out.println("Palindrome String");
        // }
        // else{
        //     System.out.println("Not a palindrome String");
        // }
       int i = 0;
       int j=str.length()-1;
       boolean flag = true;  //true - > palindrome
       while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            flag = false;
            break;
        }
        i++;
        j--;
       }
       if (flag==true) {
         System.out.println(" Is a Palindrome");        
       }else{
        System.out.println("Not a Palindrome");
       }
    }
}
