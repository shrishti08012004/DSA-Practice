public class EvenOddPosSum {
    public static void main(String[] args) {
        
        int num = 8765;
        int position = 0;
        int oddSum = 0;
        int evenSum = 0;
        while (num!=0) {
            int lastDigit = num%10;
            position++;
            if(position%2==0){
                evenSum+=lastDigit;
            } else{
                oddSum+=lastDigit;
            }
            num/=10;
        }
       System.out.println("Even position sum " +evenSum);
       System.out.println("Odd position sum  "+oddSum);
    }  
}
