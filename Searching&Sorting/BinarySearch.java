public class BinarySearch {
   
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int arr[],int target){
      int s = 0;
      int e = arr.length-1;
    while(s<=e){
        //find the mid element
        //int mid = (s+e)/2   //might be possible that (s+e) exceeds the range of integer in java 
       int m = s + (e-s)/2;  
       if(target < arr[m]){
        e=m-1;
       }
       else if(target>arr[m]){
        s=m+1;
       }
       else{
        //ans found
        return m;
          }
        }
        return -1;
      }
    

    public static void main(String[] args) {
      //
      
      int arr[]={-11,-3,0,2,3,4,6,8,76,54};
      int target = 76;
      int ans = binarySearch(arr, target);
      System.out.println(ans);
        
    }    
}
