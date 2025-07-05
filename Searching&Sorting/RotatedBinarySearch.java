public class RotatedBinarySearch {
    public int search(int [] nums, int target){
       int pivot= findPivot(nums); 
       //if you did not find the pivot , it means the array is not rotated
       if(pivot == -1){
        //just do normal binary search
        return binarySearch(nums, target , 0 , (nums.length-1));
       }
       //if pivot is found , you have to found 2 asc sorted arrays
       if(nums[pivot] == target ){
        return pivot;
       }  

       if(target>=nums[0]){
        return binarySearch(nums, target, 0, (pivot-1));
       }   

       return binarySearch(nums, target, (pivot+1), (nums.length-1));
    }

    static int binarySearch(int [] arr, int target, int s, int e){
        while(s<=e){
            int m= s+(e-s)/2;
            if(target<arr[m]){
                e=m-1;
            }else if(target>arr[m]){
                s=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }

    //This will not work in duplicate values
    static int findPivot(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            //4 cases over here
            if(m<e && arr[m]>arr[m+1]){
                return m;
            }
            if(m>s && arr[m] < arr[m-1]){
                return m-1;
            }
            if(arr[m] <= arr[s]){
                e=m-1;
            }else {
                s=m+1;
            }   
        }
        return -1;
    }

    // static int findPivotWithDuplicates(int[] arr) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         // 4 cases over here
    //         if (mid < end && arr[mid] > arr[mid + 1]) {
    //             return mid;
    //         }
    //         if (mid > start && arr[mid] < arr[mid - 1]) {
    //             return mid-1;
    //         }

    //         // if elements at middle, start, end are equal then just skip the duplicates
    //         if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
    //             // skip the duplicates
    //             // NOTE: what if these elements at start and end were the pivot??
    //             // check if start is pivot
    //             if (start < end && arr[start] > arr[start + 1]) {
    //                 return start;
    //             }
    //             start++;

    //             // check whether end is pivot
    //             if (end > start && arr[end] < arr[end - 1]) {
    //                 return end - 1;
    //             }
    //             end--;
    //         }
    //         // left side is sorted, so pivot should be in right
    //         else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
    //             start = mid + 1;
    //         } else {
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
       
    }
}
