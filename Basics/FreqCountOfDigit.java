import java.util.HashMap;

public class FreqCountOfDigit {
    public static void main(String[] args) {
        int num = 724272;
        HashMap<Integer,Integer> map=new HashMap<>();
        while (num!=0) {
            int digit=num%10;
            if(map.get(digit)==null){//get(key)
               map.put(digit,1); //put(key,value)
            }else{
                int count = map.get(digit); //get current count
                count++;                    //add 1 to it
                map.put(digit,count);        //update the map
            }
            num = num/10;
        }
        System.out.println(map);
    }
    
}
