public class SumOfDigits {
    public static void main(String[] args) {
        
        int num=146;
        int sum=0;
        while (num!=0) {

            int lastDigits = num%10;
             sum = sum+lastDigits;
             num/=10;  
        } 
        System.out.println(sum);
    }   
}
