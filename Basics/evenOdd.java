import java.util.Scanner;
public class evenOdd {
    //XOR: even => +1  &  odd=> -1
    //AND: even => 0 & odd => 1
    //OR: even => +1 & odd => no change
    
    public static void main(String[] args) {

        EvenOddXor();
        EvenOddAnd();
        EvenOddOr();
    }

    public static void EvenOddXor(){
        System.out.println("Enter the required no. that test using Xor");
        Scanner sc=new Scanner(System.in);
        int  n= sc.nextInt();
        
        if((n^1) == n+1){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }  
    }

     public static void EvenOddAnd(){
        System.out.println("Enter the required no. that test using And");
         Scanner sc=new Scanner(System.in);
         int n= sc.nextInt();
        
        if((n&1)== 0){
            System.out.println("Even");
          }else{
        System.out.println("Odd");
       }
     }

     public static void EvenOddOr(){
        System.out.println("Enter the required no. that test using Or");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
       
       if((n|1)== n+1){
           System.out.println("Even");
         }else{
       System.out.println("Odd");
      }
    }
}
