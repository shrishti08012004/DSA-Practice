//import java.util.*;
public class substr {
    public static void main(String[] args) {
        // String str = "Hello";
        // System.out.println(str.substring(0,2));
        // System.out.println(str.substring(2));
        // System.out.println(str.substring(0,2)+" "+str.substring(2));

        // String s = "physics";
        // for(int j=2; j<4; j++){
        //     System.out.print(s.substring(j));
        // }
        String a = "abcd";
        for(int i=0; i<=a.length(); i++){
           for(int j=i+1; j<=a.length(); j++){
             System.out.println(a.substring(i,j));
        }
           }
    }
}
