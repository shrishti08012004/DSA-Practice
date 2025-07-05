public class ArraySortedOrNot {
    static boolean isSorted(int []arr,int index){
   //base case
   if(index == arr.length-1){
    return true;
   }
   if(arr[index]>arr[index+1]){
    return false;
    // System.out.println("");
   }
   //small problem
   return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        //arrays are mutable
        int arr[] = {10,20,30,40,50};
        System.out.println(isSorted(arr, 0)?"Sorted":"Not Sorted");
    }
}
