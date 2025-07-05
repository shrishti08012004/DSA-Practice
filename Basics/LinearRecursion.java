public class LinearRecursion {
    
        static void printname(int num){
            //Recursion stop
            if(num==0){ //base case or Termination case
                return;
            }
            //pre processiong 
         System.out.println("Shrishti " +num);
         //num-1 (small problem)+ Recursion 
            printname(num-1); //Recursion call at the end of the function :=> "Tail Recursion"
            //Post processing
            System.out.println("Mishra " +num);
          }// End Bracket(Tail)
        
        public static void main(String[] args) {
            printname(5);
        }
    }

