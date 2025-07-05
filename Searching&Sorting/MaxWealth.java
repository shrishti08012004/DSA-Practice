public class MaxWealth {
    static int maximumWealth(int account[][]){
        //person = row account = col
    int ans= Integer.MIN_VALUE;
   for (int person = 0; person < account.length; person++) {
   //When you start a new column take a new sum for that row
   int sum = 0; 
   for(int acc=0; acc< account[person].length; acc++){
  sum += account[person][acc];
    }
    //now we have sum of account of person
    //check with overall answer
    if(sum>ans){
        ans= sum;
    }
   }
   return ans;
    }
    public static void main(String[] args) {
        int account[][]={
            {2,3,1},
            {1,2,3}
        };
        System.out.println(maximumWealth(account));
    }
}
 