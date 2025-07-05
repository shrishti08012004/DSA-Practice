public class RotateANumber {
    public static void main(String[] args) {
        int num=12345;
        int rotations=20;
        int count =0;
        int cpy=num;
        while (cpy!=0) {
            count++;
            cpy/=10; 
        }
        rotations = rotations%count;

        int pow=(int)Math.pow(10,rotations);
        int lhs=num/pow;
        int rhs=num%pow;
        // System.out.println(lhs);
        // System.out.println(rhs);
       
        int pow2 = (int)Math.pow(10,count-rotations);
        int result = rhs*pow2+lhs;
        System.out.println(result);
    }
}
