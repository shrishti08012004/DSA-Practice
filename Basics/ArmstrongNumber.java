public class ArmstrongNumber {
    
    public static void main(String[] args) {
        int num=123;
        int cpy=num;
        int count=0;
        int sum=0;

        //Count digits
        while(cpy!=0){
            count++;
            cpy=cpy/10; //make number small
        }
        System.out.println(count); //print count of digits
        cpy=num;

        while (cpy!=0) {
            int digit=cpy%10;
            sum = sum + (int)Math.pow(digit,count);
            cpy = cpy / 10;
        }
        System.out.println(num == sum? "ArmStrong Number" : "Not an ArmStrong Number");
    }
}
