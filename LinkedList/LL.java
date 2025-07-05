public class LL{

 public static class Node{
    int data; //value
    Node next; //address of the next node
    Node(int data){
        this.data = data;
    }
   }

public static class linkedlist{
    Node head = null;
    Node tail = null;
    int size=0;

    void insertAtEnd(int val){
        Node temp= new Node(val);
        if(head == null){
            head = temp;
        }
        else{
            tail.next= temp;
        }
        tail= temp;
        size++;
    }

    void display(){
    Node temp = head;
   while (temp!=null) {
    System.out.print(temp.data+" ");
    temp = temp.next;
   }
   System.out.println();
    }


    void insertAtHead(int val){
        Node temp= new Node(val);
        if(head== null){  //for empty list
            head=tail=null;
        }
        else{  //for non empty list
        temp.next = head;
        head = temp;
        }
        size++;
    }

    void insertAt(int idx, int val){
        Node t = new Node(val);
        Node temp = head;
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        else if(idx==0){  
            insertAtHead(val);
            return;
        }
        else if(idx<0 || idx>size){
            System.out.println("Wrong Index");
        }
        for(int i=0; i<=idx-1; i++){
            temp= temp.next;
        }
        t.next = temp.next;
        temp.next=t;
        size++;
    }

    int getAt(int idx){
        Node temp= head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    void deleteAt(int idx){
        if(idx==0){
            head=head.next;
        }
        Node temp= head;
        for(int i=0; i<=idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail=temp;
        size--;
    }

    // int size(){  //O(n)
    //     // Node temp = head;
    //     // int count=0;
    //     // while (temp!=null) {
    //     //     count++;
    //     //     temp = temp.next;
    //     // }
    //     // return count;
    //     return size;
    // }
}

    public static void main(String[] args) {
      
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(6); //6
        ll.insertAtEnd(7);  //6 7
         ll.display();
       // System.out.println( ll.size);
        ll.insertAtEnd(12); // 6 7 12
        ll.insertAtEnd(19); // 6 7 12 19
        ll.display();
        ll.insertAtHead(1); // 1 6 7 12 19
       // System.out.println( ll.size);
        ll.insertAt(1,99); // 1 6 99 7 12 19
        ll.display();
        ll.deleteAt(4);
        //ll.getAt(3);
         ll.display();
        System.out.println(ll.getAt(3));
       // ll.display();
    }
}
