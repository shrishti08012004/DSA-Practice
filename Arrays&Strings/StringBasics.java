import java.util.*;
public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String x = "Shrishti Mishra  ";
          String y = "Heykarishma  ";
        // System.out.println(str);
       // String x = sc.nextLine();
       // System.out.println(x.length());
        // char ch = x.charAt(5);
        // System.out.println(ch);
        
       // System.out.println(r.indexOf('r'));
        String gtr = "Heybaby";
        // System.out.println(y.compareTo(gtr));

        System.out.println(y.contains("rish"));
        System.out.println(y.startsWith("Hey"));
        System.out.println(y.endsWith("Hey"));
        System.out.println(y.toUpperCase());
        System.out.println(x.concat(y));
        
    }
}
  


        //charAt() : returns the character of given index
        // indexOf() : Its work is just opposit of charAt
        // compareTo() :y==gtr => 0  ; y > gtr =>  >0 ; y < gtr => <0  (lexographically) 
        //contains(): gives result if it contains in string
        //startsWith(): give true if string starts with the given letters
        //endsWith():give true if string ends with the given letters
        //toLowerCase(): return strings in lowercase
        //toUpperCase(): return strings in uppercase
        //concat(): concatenate the two strings
        //substring(i,j):
        // substring(i):
