public class EvenDigits {

    static int evenDigits(int nums[]){
    int count = 0 ;
 for (int num : nums) {
    if(even(num)){
        count++;
    }
 }
    return count;
    }

    //Function to check wheather a number contains even number of digits or not
    static boolean even(int num){
        int noOfDigits = digits2(num);
        /*
        if(noOfDigits % 2 == 0){
            return true;
        }
        return false; 
        */
        return noOfDigits % 2 == 0;
    }
    //Function to count no. of Digits
    static int digits(int num){
        if(num<0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
       //  num= (num % 10);
         count++;
         num= num/10;
        }
       return count;
    }

    static int digits2(int num){
        if(num>0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    public static void main(String[] args) {
        int nums[] = {34,45,332,4433};
       System.out.println(evenDigits(nums));
        
    }
    
}
