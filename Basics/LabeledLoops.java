public class LabeledLoops {
    
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=3 ; j++) {
             if(i==j){
                continue  outer; //skip the labeled iteration  
                 //break outer; // exit from the outer (Labeled) loop
             }
             System.out.println(i + " " +j);
            }
        }
        System.out.println("exit from the loop");
    }
}
