import java.util.*;
public class Array1 {
//Declaration of Array:  zero-indexed
//type[] arrayName = new type[size];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int numbers[] = new int[size];
        //int [] marks= new int[3];
        // int marks [] = new int[3];
        // int marks[] ={97,98,89,70,79};
        // marks[0] =97;//phy
        // marks[1] = 98;//che
        // marks[2] = 89;//maths
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for (int i=0; i<5; i++) {
        //     System.out.println(marks[i]);
        // }

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();//input
        }
        int x=sc.nextInt();
         for (int i=0; i<numbers.length; i++) {
            if(numbers[i]==x){
                System.out.println("x number found at index: " +i);
          
            }
           
        // System.out.println(numbers[i]);//output
        }
    }
}
