public class StrongNumber {

    public static int fact(int n){
        if(n==0 || n==1){    //base case
         return 1 ; 
        }else{
            return n*fact(n-1);
        }
    }

    public static void strongNumber(int num, int sum ,int cpy){
        //base case
        if(num==0){
            if(sum == cpy){
                System.out.println("Strong Number");
            }else{
                System.out.println("Not a Strong Number");
            }
          return ;
        }

        //logic building
        int lastDigit = num %10;
        sum= sum + fact(lastDigit);

         //small problem
           strongNumber(num/10, sum , cpy);
          
    }

    // // Function to check if a number is a Strong number
    // public static boolean isStrongNumber(int num) {
    //     int sum = 0;
    //     int original = num;

    //     while (num > 0) {
    //         int lastDigit = num % 10;
    //         sum += fact(lastDigit);
    //         num = num / 10;
    //     }

    //     return sum == original;
    // }
    public static void main(String[] args) {
        int num=145;
        int cpy=num;
         strongNumber(145, 0, cpy);
       // System.out.println(r);
    }
    
}
