public class CountEvenOddRecurr {
    // static void countEvenOdd(int range, int even, int odd){
    //    //Base case
    //    if(range == 0){
    //     System.out.println("Even Count "+even+ "  Odd Count "+odd);
    //     return; //exit from the current function call
    //    }
    //    //Logic (Stack Building)
    //    if(range % 2 == 0){
    //     even++;
    //    }
    //    else{
    //     odd++;
    //    }
    //    //Small Problem
    //    countEvenOdd(range-1, even, odd);
    // }
    // //Time complexity: O(n)   and Space Complexity: O(n)
    
    //int[] - 2 size
    //int [] arr = new int[2];
    //int arr[] = new int[2]; //fill with 0
    // int arr [] = {10,20};
    static int[] countEvenOdd(int range){
        //Base Case
        if(range == 0){
            int result [] = new int[2]; //fill with 0
            //[0]= evenCount, [1]= oddCount
            return result;
        }
        //Small Problem
        int result[] = countEvenOdd(range-1);
        //Logic
        if(range%2==0){
            result[0] = result[0]+1;
        }
        else{
            result[1] = result[1] + 1;
        }
    }

    public static void main(String[] args) {
        // countEvenOdd(10, 0, 0);
        int arr[] = countEvenOdd(10);
        System.out.println("Even Count "+arr[0]);
        System.out.println("Odd Count "+arr[1]);
    }
}
