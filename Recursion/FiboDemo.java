public class FiboDemo {
    static int fiboDemo(int n){
        //Base case
        if(n<=1){
            return n;
        }
        int firstTerm=fiboDemo(n-1);
        int secondTerm=fiboDemo(n-2);
         return firstTerm+secondTerm;

    }

    public static void main(String[] args) {
        int result = fiboDemo(30);
        System.out.println(result);
    }
}
