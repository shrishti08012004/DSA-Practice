public class PrintTable {
    static String printTable2(int num, int val){
       if(val==0){
        return "";
       } 
       String result= printTable2(num, val-1);
       String expression = num+"*"+val+"="+(num*val)+"\n";
       return result+expression;
    }
    public static void printTable(int num,int val){
        //base case
        if(val==0){
            return;
        }
        //small problem
        printTable(num, val-1);
          //stack fall
        System.out.println(num+"*"+val+"="+(num*val));
    }
    public static void main(String[] args) {
        // printTable(5, 10);
        String r= printTable2(5, 10);
        System.out.println(r);
        
    }
}
