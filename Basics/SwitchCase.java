import java.util.Scanner;;
public class SwitchCase {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        switch (n) {
            case 1 ->
            //When we use arrow instead of semi-colon then no need of using break.
            System.out.println("Pizza");
                //  break;
            case 2->
                 System.out.println("Burger");
                    //   break;
            case 3->
            System.out.println("Chilli Potato");
                //  break;
           case 4->
                 System.out.println("Fried Rice");
                    //   break;
            case 5->
                      System.out.println("Momo");
                        //    break;
           case 6->
           System.out.println("Chowmein");  
             
            default->
                System.out.println("Invalid number");
        }
        
    }
}
