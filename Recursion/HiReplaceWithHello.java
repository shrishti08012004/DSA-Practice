public class HiReplaceWithHello {

    static String replaceHiWithHello(String str){
        //base case
        if(str.length()<=1){
            return str;
        }
     if(str.charAt(0)=='h'&& str.charAt(1)=='i'){
        String smallString = str.substring(2);
        String result = replaceHiWithHello(smallString);
        return "Hello" + result; 
     }else{
        String smallString = str.substring(1);
        String result = replaceHiWithHello(smallString);
        char firstChar = str.charAt(0);
        return firstChar + result;
     }
    }
    public static void main(String[] args) {
        String str = "hi shrishti hi riya";
        System.out.println(replaceHiWithHello(str));
    }
}
