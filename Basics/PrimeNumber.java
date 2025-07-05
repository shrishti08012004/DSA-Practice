public class PrimeNumber {
    public static void main(String[] args) {
        
        int num=176;
      
        for(int i=2; i<num; i++){
            if(num%i==0){
                System.out.println("Not a prime no.");
                return;
            } 
        }
        System.out.println("Prime no.");
    }  
}
