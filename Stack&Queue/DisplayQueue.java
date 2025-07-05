import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
       // System.out.println(q.isEmpty());
        q.add(1);
    //     System.out.println(q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        // rear -> 7 6 5 4 3 2 1  - > Front
       // System.out.println(q.size());
        // System.out.println(q);
        while(q.size()!=0){
            System.out.print(q.peek()+" ");
            q2.add(q.poll());
        }
        while(q2.size()!=0){
            q.add(q2.poll());  
        }
    }
    
}
