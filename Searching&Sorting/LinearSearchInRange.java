public class LinearSearchInRange {

    static int search(int arr[], int target , int start, int end){
   if(arr.length == 0){
    return -1;
   }
   for(int i=start; i<=end ; i++){
    if(arr[i] == target){
        return i;
    }
   }
   return -1;
    }

    static int findMinimum(int arr[], int min){
       // int min = arr[0];
        // if(arr[0]== -1){
        //     return -1;
        // }
        for(int i=0; i<arr.length-1; i++){
         if(arr[i] > arr[i+1]){
            min = arr[i+1];
         }
         else{
            min = arr[i];
         }
        }
        return min;
    }
    public static void main(String[] args) {
       // int arr[] = new int[12];
        int arr[] = {200,369,43,55,64,45,86,37,65,7,77};
        //int target= 86;
        // System.out.println(search(arr, target, 2, 6));
        System.out.println(findMinimum(arr,0));
    }
}
