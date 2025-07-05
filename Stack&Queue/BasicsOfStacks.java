//import java.util.ArrayList;
import java.util.Stack;
public class BasicsOfStacks {
    public static void main(String[] args) {
        //int [] arr = new inr[5];
       // ArrayList<Integer> arr = new ArrayList<>();
       Stack<Integer> st = new Stack<>();
       System.out.println(st.isEmpty());
        System.out.println("size is : " +st.size());
        System.out.println(st);
       st.push(1);
         System.out.println("size is : " +st.size());
        System.out.println(st);
     //   System.out.println(st.isEmpty());
       st.push(23);
         System.out.println("size is : " +st.size());
        System.out.println(st);
     //   System.out.println(st.isEmpty());
       st.push(98);
         System.out.println("size is : " +st.size());
        System.out.println(st);
     //   System.out.println(st.isEmpty());
       st.push(5);
         System.out.println("size is : " +st.size());
        System.out.println(st);
      //  System.out.println(st.isEmpty());
       st.push(34); 
         System.out.println("size is : " +st.size());
        System.out.println(st);
       // System.out.println(st.isEmpty());
       //peek 
       System.out.println(st.peek()); //Stack works on the principle of LIFO (Last In First Out) or FILO (First In Last Out)
       System.out.println(st);
       st.pop();
       System.out.println(st);
        st.pop();
       System.out.println(st);
       System.out.println("size is : " +st.size());
       //System.out.println(st.isEmpty());
       while(st.size()>2){
        st.pop();
           }
           System.out.println(st.peek());
           System.out.println(st);

           
    }
    
}
