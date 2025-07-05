public class StringSearchAndReplace {
    //Note: Strings are immutable
    static String searchAndReplace(String str, char search, char replace){
    if(str.length() == 0){
        return "";
    }
        //small problem
  String r = searchAndReplace( str.substring(1), search, replace);
  if(str.charAt(0) == search){
    return replace + r;
  }else{
    return str.charAt(0)+r;
  }

    }
    public static void main(String[] args) {
        String r = searchAndReplace("hello", 'l','x');
        System.out.println(r);
    }
}
