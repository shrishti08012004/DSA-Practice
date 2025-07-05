public class MinMaxDemo {
    
    static int [] getMinMax(int arr[], int index){
        //Base case
        if(arr.length == index){
            int r[] = new int[2]; //{0,0}
            r[0] = Integer.MAX_VALUE;
            r[1] = Integer.MIN_VALUE;
            return r;
        }
        //Small problem
        int result [] = getMinMax(arr, index+1);
        //Min Element
        if(result[0]>arr[index]){
            result[0] = arr[index];
        }
        //Max element
        else if(result[1]<arr[index]){
            result[1] = arr[index];
        } 
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {10,90,100,200,50,1,88,40};
        int result [] = getMinMax(arr, 0);
        System.out.println("Min " +result[0]+ " Max " +result[1]);
    }
}
