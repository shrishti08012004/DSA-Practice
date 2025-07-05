import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // //insert char at index 0
        // sb.insert(0,'S');
        // System.out.println(sb);

        
        //insert char at index 2
        sb.insert(2,'n');
        System.out.println(sb);

        //delete the extra string
        sb.delete(2, 3);
        System.out.println(sb);

        //append in our string
        sb.append("e");
        sb.append("l");
         sb.append("o");
         sb.append("n");
         System.out.println(sb);
         System.out.println(sb.length());
        




    }
}
