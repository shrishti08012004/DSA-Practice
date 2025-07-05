public class SumOfDigitRecurr {
    // //Stack Building give us required result
    static void sumOfDigit(int num, int sum){
        //Base Case
        if(num == 0){
            System.out.println(sum);
            return;
        }
        int digit = num % 10;
         sum = sum + digit;
         sumOfDigit(num/10, sum);  
    }

    // //Stack Falling give us required result
    // static int sumOfDigit(int num){
    //     //Base case
    //     if(num == 0){
    //         return 0;
    //     }
    //     //small problem
    //     int sum=sumOfDigit(num/10);
    //     int digit = num % 10;
    //     sum = sum + digit;
    //     return sum;
    // }

    public static void main(String[] args) {
        sumOfDigit(123,0);
        // System.out.println(sumOfDigit(123));
    }
}
