import java.util.Arrays;

public class Pattern1 {
    static void printPattern(int row, int col){
        if(row==0){
            return;
        }
        if(col < row){
            // System.out.print("*");
            // printPattern(row, col+1);
             
            printPattern(row, col+1);
            System.out.print("*");
            }
            else{
        //    System.out.println();
        //    printPattern(row-1, 0);
        
           printPattern(row-1, 0);
             System.out.println();
            }
   }

   static void bubble(int[] arr, int r,int c){
    if(r==0){
        return;
    }
    if(c<r){
        if(arr[c]> arr[c+1]){
            //swap
            int temp = arr[c];
            arr[c]= arr[c+1];
            arr[c+1]= temp;
        }
        bubble(arr, r, c+1);
    }
    else{
        bubble(arr, r-1, 0);
    }
   }

   static void selectionSort(int[] arr, int r, int c, int max){
    if(r==0){
        return;
    }
    if(c<r){
        if(arr[c]> arr[max]){
            selectionSort(arr, r, c+1, c);
        }
        else{
            selectionSort(arr, r, c+1, max);
        }
    }
    else{
        int temp = arr[max];
      arr[max]=  arr[r-1];
        arr[r-1] = temp;
        selectionSort(arr, r-1, 0, 0);
    }
   }
    public static void main(String[] args) {
       //printPattern(5,0);
     int[] arr= {4,3,2,1};
    // bubble(arr, arr.length-1, 0);
    selectionSort(arr, arr.length, 0, 0);
     System.out.println(Arrays.toString(arr));

    }
}
