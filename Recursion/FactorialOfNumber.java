public class FactorialOfNumber {
     public static void fact(int num, int result){
        if(num==1){
            System.out.println(result);
            return;
        }
     //small problem
     fact(num-1, num*result); 
     }
    public static void main(String[] args) {
        fact(3, 1);
    }
}
