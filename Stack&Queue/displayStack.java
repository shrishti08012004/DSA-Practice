import java.util.Stack;
public class displayStack {

      public static void displayReverse(Stack<Integer> st){
        // s.push(6);
        if(st.size()==0)  return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRec(st);
        st.push(top);

        }

     public static void displayRec(Stack<Integer> st){
        // s.push(6);
        if(st.size()==0)  return;
        int top = st.pop();
        //System.out.println(top+" ");
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);


        }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
       // System.out.println(st);
        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //     int x = st.pop();
        //     rt.push(st.pop());

        // }
        // while (rt.size()>0) {
        //     int x = rt.pop();
        //     System.out.println(x+" ");
        //     st.push(x);
        //}
         System.out.println(st);


//Printing elements of stack using arrays
        // int n = st.size();
        // int [] arr = new int[n];
        // for(int i=n-1; i>=0; i--){
        //     arr[i] = st.pop();
        // }
        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i]+" ");
        //     st.push(arr[i]);
        // }

//printing elements of stack using Recursion
      displayReverse(st);
      System.out.println();
      displayRec(st);
    // System.out.println(st);
    }
}
