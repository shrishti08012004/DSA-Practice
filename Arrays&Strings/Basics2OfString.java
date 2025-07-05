import java.util.*;
public class Basics2OfString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str = str + "def";  //String + String
        str = str + "t";    //String + char
        str = str + 8;      //string + int 
        System.out.println(str);
        System.out.println(str+'e');  
        System.out.println(str+'6'); 
        
    }
}
