import java.util.*;
public class toggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        //toggle
        // PHysiCs -> phYSIcS
        for(int i=0; i<sb.length(); i++){
            //P -> p
            // check -> alphabet -> Small(start with a-97) or Capital(start with A-65) ?  zero(start with 0-48)
            
            boolean flag = true; //true -> Capital
            char ch = sb.charAt(i);  //A
            if(ch==' ') continue;
            int asci = (int)ch; // 65
            if(asci>=97)  flag = false;  //small
            if(flag==true){  //capital
                asci +=32;
                char dh = (char)asci; // a
                sb.setCharAt(i,dh);  
            }
            else { //small
                asci -= 32;
                char dh = (char)asci;
                sb.setCharAt(i, dh);

            }
        }
        System.out.println(sb);
    }
}
