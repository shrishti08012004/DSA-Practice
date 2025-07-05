public class GreatestOfThree {
    public static void main(String[] args) {
        
        int a=100;
        int b=200;
        int c=300;

        if(a>b){
           if(a>c){
            System.out.println("a is greatest");
           } else{
            System.out.println("c is greatest");
           }
        
        }else{
            if(b>c){
                System.out.println("b is greatest");
            }else{
                System.out.println("c is greatest");
            }
            
        }
    }    
}
