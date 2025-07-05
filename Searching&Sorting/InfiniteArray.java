public class InfiniteArray {

    static int binarySearch(int[] arr, int target, int s, int e){
        while(s<=e){
            //find the middle
            int m= s + (e-s)/2;
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

    static int ans(int [] arr, int target){
        //first find the range
        //first start with a box of size 2
    int s=0;
    int e=1;
    //condition for the target to lie in the range
    while(target>arr[e]){
        int temp =e+1;
        //double the box value
        //end= previous end + sizeOfBox*2
        e=e+(e-s+1)*2;   
        s= temp;
    }
    return binarySearch(arr, target, s, e);
    }

    public static void main(String[] args) {
        int [] arr={3,4,7,9,10,90,100,130,160,170};
        int target=10;
        System.out.println(ans(arr, target));
    }
}
