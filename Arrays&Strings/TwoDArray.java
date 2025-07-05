import java.util.*;

//type[][] arrayName = new type[rows][columns];
//int[][] numbers = new int[3][5];
public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int cols=sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input:
        //rows:
        for(int i=0; i<rows; i++){
            //columns:
            for(int j=0; j<cols; j++){
                numbers[i][j]= sc.nextInt();
            }
        }

        //output:
          //rows:
          for(int i=0; i<rows; i++){
            //columns:
            for(int j=0; j<cols; j++){
             System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
