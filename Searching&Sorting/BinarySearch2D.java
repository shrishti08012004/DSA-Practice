import java.util.*;

public class BinarySearch2D {
    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {11, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int target = 37;

        int[] result = search(matrix, target);
        System.out.println("Position: [" + result[0] + ", " + result[1] + "]");
      // System.out.println(result);  => it give the answer in form of hexadecimal i.e => [I@372f7a8d
    }
}



// import java.util.*;
// public class BinarySearch2D {
//     static int search(int[][] matrix, int target){
//       int r=0;
//       int c=matrix.length-1;
//     //   for(int row=0;row<=matrix.length-1;row++){
//     //       for(int col=0; col<=matrix[row].length-1;col++){
//     //        }
//     //      }
//     //   }

//     while(r<matrix.length && c>=0) {
//     if(matrix[r][c]==target){
//         return new int[]{r,c};
//     }
//     if(matrix[r][c]<target){
//         r++;
//     }else{
//         c--;
//     }
//     }
//     return new int[]{-1,-1};
// }
    
//     public static void main(String[] args) {
//         int matrix [][]= {
//             {10,20,30,40},
//             {11,25,35,45},
//             {29,29,37,49},
//             {33,34, 38,50}
//         };
//         System.out.println(search(matrix, 37));
//     }
// }
