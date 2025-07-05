import java.util.Scanner;
public class HollowTriangle {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Size of hollow triangle ");
          int size= sc.nextInt();
          for(int row=1;row<=size;row++){
            for(int space=row;space<size;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=(2*row-1);star++){
                if(star==1 ||  row==size || star ==(2*row-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
          }
    }  
}
