import java.util.ArrayList;

public class Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
       // ArrayList<String> list2= new ArrayList<>();
        //ArrayList<Boolean> list3 = new ArrayList<>();

        //add elements
        list.add(23);
        list.add(23);
        list.add(22);
        list.add(38);
        list.add(00);
        System.out.println(list);
        int element= list.get(1);
        System.out.println(element);

        //add element in between in ArrayList
        list.add(3,90);
        System.out.println(list);

        //set elements
        list.set(0,5);
        System.out.println(list);

        //delete element
        
    }
}
