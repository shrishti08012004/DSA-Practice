
public class LLBasics {

    public static void insertAtEnd(Node head, int val){
      Node temp = new Node(val);
      Node t= head;
      while(t.next!=null){
        t=t.next;
      }
      t.next = temp;
    }

 public static void display(Node head){
    Node temp = head;
    while (temp!=null) {
      System.out.print(temp.data+" ");  
      temp= temp.next;
    }
    System.out.println();
 }

 public static Node nthNode(Node head, int n){
  int size =0;
        Node temp= head;
        while(temp!= null){
            size++;
            temp= temp.next;
        }

        int m= size- n + 1;
        //nth node from start
        temp = head;
        for(int i=1 ; i<=m-1; i++){
            // temp.data = temp.next.data;
            // temp.next = temp.next.next;
            temp = temp.next;
        }
        return temp;
 }

 public static Node deleteNthFromEnd(Node head, int n){
  Node slow = head;
  Node fast= head;
  for(int i=0; i<=n ; i++){
    fast= fast.next;
  }
  if(fast==null){
    head = head.next;
    return head;
  }
  while(fast.next!=null){
    slow = slow.next;
    fast = fast.next;
  }
  slow.next = slow.next.next; 
  return head;
 }

//  public static void displayr(Node head){
// if(head==null) return;
// System.out.print(head.data + " ");
// displayr( head.next);
// //System.out.print(head.data + " ");
// }

   public static int length(Node head){
    int count=0;
    while(head!=null){
        count++;
        head = head.next;
    }
    return count;
   }

     public static class Node{
        int data; //value
        Node next; //address of the next node
        

     Node(int data){
        this.data = data;
        }
    }

    public static void main(String[] args) {
          Node a =  new Node(5); //head node
        //   System.out.println(a.next);  //null
          Node b =  new Node(3);
          Node c =  new Node(9);
          Node d =  new Node(8);
          Node e=   new Node(16);
        //   Node f= new Node(23);
        // 5 3 9 8 16
           a.next = b; //5 -> 3 9 8 16
           b.next = c; //5 -> 3 -> 9 8 16  
           c.next = d; //5 -> 3 -> 9 -> 8  16
           d.next = e; //5 -> 3 -> 9 -> 8 -> 16
        // e.next = f; //5 -> 3 -> 9 -> 8 -> 16 -> 23

       // insertAtEnd(a,87);

         // display(a);

        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println(e.data);

        
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

       // Node temp= a;
        // for (int i = 0; i<= 5; i++) {
        //    System.out.print(temp.data);
        //    temp= temp.next; 
        // }

        // while(temp!=null){  //printing the list
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;

         display(a);
         a= deleteNthFromEnd(a, 4);
          display(a);

        // displayr(a);

     //System.out.println(length(a));
     
    //  Node q= nthNode(a, 3);
    //  System.out.println(q.data);
           }

    }

