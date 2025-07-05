public class SumOfNnumbers {

    public static int sumOfN(int num,int sum){
        //base case
        if(num == 0){
            return sum;
        }
        //logic
        sum = sum+num;
         
        return  sumOfN(num-1, sum);
    }
    public static void main(String args[]){
         int s= sumOfN(5, 0);
         System.out.println(s);
    }
}
