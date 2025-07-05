public class BreakVsContinue {
    public static void main(String[] args) {
        for (int i = 1; i<=3; i++) {
            for(int j=1;j<=3;j++){
                if (i==j) {
                         
                  continue;  //continue-> exit from the current iteration
                    // break; 
                             //break-> exit from the current loop
                             //return; //return-> exit from the current function   
                }  
                System.out.println(i+" "+j);
            }
             
         }  
    }
}
