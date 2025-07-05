import java.util.*;
public class stringbuilderBasics {
    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder(100);
         StringBuilder str = new StringBuilder("Hello");  //initial capacity : 16
         System.out.println(str);
        
         str.insert(2,'y');
         System.out.println(str);
         str.deleteCharAt(2);
         System.out.println(str);
         str.append(" World");
         System.out.println(str);
        // hello World -> Hello Riya
       // str.setCharAt(6, 10);
       str.append(10);
      // System.out.println(str);

         str.reverse();
         System.out.println(str);

         str.reverse();
         System.out.println(str);

        str.delete(1,8);
        System.out.println(str);

    }
}

//Problems with Strings: -> interning -> immutability -> poor performance
//Important constructor of stringBuilder Class: 1) StringBuilder()
            //2) StringBuilder(String str)     3) StringBuilder(int capacity)
            //setCharAt(idx,ch) and append(ch)
            // insert(idx,ch)  and deleteCharAt(ch)
            //reverse()  and //delete(i,j)