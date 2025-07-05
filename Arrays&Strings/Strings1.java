import java.util.*;
public class Strings1 {
    //Note: Strings are immuatble in java 
    public static void main(String[] args) {
        // // //String Declaration
        // // String name="Tony";
        // // String fullName="Tony Stark";
        // // String sentence = "My name is Tony Stark";
        // Scanner sc = new Scanner(System.in);
        // // String name =   sc.next(); // for taking a word as a input
        // String name =   sc.nextLine();  //for taking whole sentence as input
        // System.out.println("Your name is : " +name);


    //     //Concatenation
    //     String firstname="Shrishti";
    //     String lastname = "Mishra";
    //     String fullname = firstname +" "+ lastname;
    //     System.out.println(fullname);
    //     System.out.println(fullname.length());
    //    //charAt
    //    for(int i=0; i<fullname.length(); i++){
    //     System.out.println(fullname.charAt(i));
    //    }
        
    // //Comparision of two Strings
    //  String name1= "Tony";
    //  String name2="Tony";

    //  //1 s1 > s2 : +ve value
    //  //2 s1 == s2 : 0
    //  //3 s1 < s2 : -ve value

    //  if(name1.compareTo(name2) == 0){
    //     System.out.println("Strings are equal");
    //  }else{
    //     System.out.println("Strings are not equal");
    //  }


    String sentence = "My name is Tony";
    String name = sentence.substring(11,sentence.length());
    System.out.println(name);
    }
}
