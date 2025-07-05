
public class LinearSearch{

  
    public static void main(String[] args) {
       // int arr[] = new int[5];
       int nums[] = {2,3,4,5,6};
       int target = 5;
    //    int ans = LinearSearch(nums, target);
    //    System.out.println(ans);
        int ans = linearSearch2(nums, target);
       System.out.println(ans);



       //this line will execute if none of this return
       //hence the target element not found
    }

      //Search in the array : return the items if item found otherwise return -1 if item not found
     public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //Run the loop
        for(int index=0; index<arr.length; index++){
            //check for every index if the element is equals to the target
            int element = arr[index];
    if(element == target){
     return index;
    }
        }
        return -1;
    }

    //Search the target and return the element
    static int  linearSearch2(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        //run the loop
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}