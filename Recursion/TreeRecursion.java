public class TreeRecursion {
    static void fun(int num){
        //Base case
        if(num<=0){
            return;
        }
        System.out.println("Pre Call  "+num);
        fun(num-1); //Recursive call
        System.out.println("In between Call "+num);
        fun(num-2); //Recursive call
        System.out.println("Post Call  "+num);
    }
    public static void main(String[] args) {
        fun(3);
    }
    
}
