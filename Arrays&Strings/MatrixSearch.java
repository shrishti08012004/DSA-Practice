import java.util.*;

//Q: Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

public class MatrixSearch {
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

        int x= sc.nextInt();

        //traverse
         //rows:
         for(int i=0; i<rows; i++){
            //columns:
            for(int j=0; j<cols; j++){
                //compare with x
                if(numbers[i][j] == x){
                    System.out.println("X is found at location (" + i + "," +j+" )");
                }
            }
        }
    }
}
