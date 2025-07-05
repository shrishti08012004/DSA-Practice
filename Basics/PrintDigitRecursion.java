public class PrintDigitRecursion {
    static void printDigit(int num){
      //Base Case
      if(num==0){
        return;    //stack Fall
      }
      //Small problem
      printDigit(num/10);
      System.out.println(num%10);//Post Processing
    }
    public static void main(String[] args) {
        printDigit(12345);
     }
}
