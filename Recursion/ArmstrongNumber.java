public class ArmstrongNumber {
   static int countDigit(int num){
        if(num == 0){
            return 0;
        }
        //small Problem
        int count = countDigit(num/10);
        return count + 1;
   }

   /*
    * 1. Digit Count
    */

    static void computeArmStrongNumber(int num, int sum, int cpy, int count){
        //Base case
        if(num == 0){
            if(sum == cpy){
                System.out.println("ArmStrong Number");
            }
            else{
                System.out.println("Not an ArmStrong Number");
            }
            return;
        }
    //Logic
    // int count = countDigit(cpy);
    int digit = num%10;
    int result = (int)Math.pow(digit,count);
    sum=sum+result;
    computeArmStrongNumber(num/10, sum, cpy,count);
    }
    public static void main(String[] args) {
        int num=153;
        int count= countDigit(num);
        computeArmStrongNumber(num,0,num,count);
    }
}