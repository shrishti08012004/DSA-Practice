import java.util.*;

public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
    //     System.out.println(q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
       //System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q.size());

   
    // for(int i=1; i<q.size(); i++){
    //     System.out.println(q.peek());
    //     q.remove(i);
    //     q2.add(i);
    //    // System.out.println();
    // }
    // System.out.print(q2);
        
    }
    
}
