import java.util.Stack;
import java.util.Scanner;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
       // int n;
        // System.out.println("Enter the no. of elements you want to insert in the stack");
        // n = sc.nextInt();
        // System.out.println("Enter the elements");
        // for(int i=1; i<=n; i++){
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(3);
        st.push(5);
        System.out.println(st);

        //reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
         int x= st.peek();  
        //   rt.push(x);
        //   st.pop();
        rt.push(st.pop());
         }
         System.out.println(rt);

         //again take another stack to push all the elements of reverse order into another stack
         Stack<Integer> ot = new Stack<>();
        while(rt.size()>0){
         int y= rt.peek();  
        //   ot.push(x);
        //   rt.pop();
        ot.push(rt.pop());
         }
         System.out.println(ot);
        
    }
}
