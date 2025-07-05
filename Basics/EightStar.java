import java.util.Scanner;
public class EightStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size ");
        int size = sc.nextInt();
        for(int col=1 ; col<size * 2; col++){
            for(int row=1;row<=size;row++){
            if((col==1|| col==size|| col==size*2-1)&& (row==1 || row==size)){
                 System.out.print(" ");
            } else if(col==1 || col==size || col == (size*2)-1 || row==1 || row == size){
                 System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
