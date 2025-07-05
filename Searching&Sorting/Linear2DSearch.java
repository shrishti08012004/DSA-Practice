import java.util.Arrays;

public class Linear2DSearch {

    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
        for(int col=0; col<arr[row].length;col++){
           if(arr[row][col] == target){
            return new int [] {row, col};
              } 
           }

        }
        return new int[]{-1, -1};
    }

    static int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints: arr){
            for(int element: ints){
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] arr = {
            {23,4,5},
            {12,34,56,3},
            {25,65,66,78},
            {45,29}
        };
        int target = 78;
        int [] ans = search(arr, target); // format of return value{row, col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
}
