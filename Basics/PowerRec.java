public class PowerRec {

    //Using return based approach (stack falling)
    static int computePower(int num, int pow){
         //base case
         if(pow == 1){
            return num;
         }
        //small problem
        int result = computePower(num, pow-1);
        return result * num;
    }
     //void based approach (stack building) s 
    static void computePower(int num, int pow, int result){
       //Base case
       if(pow ==0){
        System.out.println(result);
        return; 
       }
        //small problem
       computePower(num, pow-1, num*result);

    }
    public static void main(String[] args) {
        // computePower(2, 3, 1);
        int r= computePower(2, 5);
        System.out.println(r);

    }
}
 