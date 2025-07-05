import java.util.Stack;

public class ReverseStack {

    public static void pushAtBotttom(Stack<Integer> st, int x){
     if(st.size()==0){
      st.push(x);
      return;
     }
     
     int top = st.pop();
     pushAtBotttom(st, x);
     st.push(top);
     return;
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBotttom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //Iterative Solution to reverse a stack

        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // System.out.println(rt);
        // Stack<Integer> qt = new Stack<>();
        // while(rt.size()>0){
        //     qt.push(rt.pop());
        // }
        // System.out.println(qt);
        
        // while(qt.size()>0){
        //     st.push(qt.pop());
        // }
        // System.out.println(st);
        // //TC: O(3n) SC: O(2n)

        //Recursive solution
        reverse(st);
        System.out.println(st);


    }
    
}
