public class LinklistImplementation {
    public static class Node{  //user defined datatype
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LLStack{  // user defined data structure
       Node head = null;
       int size = 0;
       
       void push(int x){
          Node temp = new Node(x);
          temp.next = head;
          head = temp;
          size++;
       }

       int pop(){
        if(head==null){
            System.out.println("Stack is Empty!");
            return -1;
        }
        int x = head.val;
        head = head.next;
        return x;

       }
        int peek(){
            if(head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }


    //    void display(){
    //     Node temp = head;
    //     while(temp!=null){
    //         System.out.print(temp.val+" ");
    //     }
    //     System.out.println();

    //    }

       int size(){  //getter
        return size;
       }

       void displayRev(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
       }

       void displayrec(Node h){
        if(h == null) return;
         displayrec( h.next);
         System.out.println(h.val);

       }

       void display(){
            displayrec(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {

        LLStack st = new LLStack();
        st.push(4);
        st.display(); //4
        st.push(5);
        st.display();  // 4 5
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size());  // 3
        st.pop();
        st.display(); // 4 5
         System.out.println(st.size());  // 2
         st.push(7); // 4 5 7
         st.push(8); // 4 5 7 8
         st.push(9); // 4 5 7 8 9
         System.out.print(st.size());
         st.push(100);
    }
    
}
