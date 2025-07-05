public class PrintName {
    static void printname(int num){
        //Recursion stop
        if(num==0){ //base case or Termination case
            return;
        }
        //pre processiong 
     System.out.println("Shrishti");
     //num-1 (small problem)+ Recursion 
        printname(num-1); //Recursion call at the end of the function :=> "Tail Recursion"
        //Post processing
      }// End Bracket(Tail)
    
    public static void main(String[] args) {
        printname(10);
    }
}

//Note: 1)When recursion occur in following mannar
//           Recursion = > Processes   It is called "Head Recursion" and the process is pre processing.
//           Process = > Recursion     It is called "Tail Recursion"  and the process is post processing.
//           process = > Recursion = > Process  It is called "Linear Recursion"
//  When there are multiple calls in a Recursion then it is called "Tree Recursion."

