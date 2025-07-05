public class Palindrome {

static boolean isPalindrome(String str){
  str = str.toLowerCase();
  for(int i=0; i<= str.length()/2; i++){
    char start= str.charAt(i);
    char end= str.charAt(str.length()-1-i);

    if(start!= end){
       return false; 
    }
  }
  return true;
        // if(s>e){
        //     return;
        // }
        
        // while(s<e){
        //     if(str[s]==str[e]){
        //       s= s+1;
        //       e= e-1;
        //       System.out.println("Is a Palindrome");
        //     }else{
        //         System.out.println("Is not a Palindrome");
        //     }

        // }
        
    }
    
    public static void main(String[] args) {
        String str= "abbbra";
       System.out.println( isPalindrome(str));
    }
}
