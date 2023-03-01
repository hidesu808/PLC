import java.util.regex.Matcher;
import java.util.*;
import java.util.regex.Pattern;


public class examRedo {
     public static void main(String[] args) throws Exception {
         System.out.println("The word you type is a valid email: " + isEmail("-agu..stin0yaopisd^cozxczx@czxczxczxczx.com"));
         System.out.println("The word you type is a valid email: " + isEmail("ag-ustin0yaopisdcozxcz@xczxczxczxczx.com21"));
         System.out.println("The word you type is a valid floatingPoint: " + isFloatingPoint("15.75L"));
         System.out.println("The word you type is a valid floatingPoint: " + isFloatingPoint("-.5r"));
         System.out.println("The word you type is a valid integer: " + isInteger("5.0"));
         System.out.println("The word you type is a valid integer: " +  isInteger("020023l"));
         System.out.println("The word you type is a valid even A's, odd B's, followed by c or d: " + evenAOddBAnyCD("aabbbccd"));
         System.out.println("The word you type is a even A's, odd B's, followed by c or d: " + evenAOddBAnyCD("abbabbccd"));

     }

     public static boolean isEmail(String email) {
         return email.matches(
             "^[a-zA-Z0-9_*&^%$#!-]+(?:\\.[a-zA-Z0-9_*&^%$#!-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
     }

     public static boolean isFloatingPoint(String number) {
         return number.matches(
             "^[+-]?([0-9]*([.][0-9]+)?)+[eEfFlL]?[+-]?([1-9]*)?$");
     }

     public static boolean isInteger(String number) {
         return number.matches(
             "^[+-]?[0-9]+([ul(Ui)]+)?(64)?$");
     }

     public static boolean evenAOddBAnyCD(String word){
        return word.matches(
             "^(a|b(aa|bb)*(ab|ba)) (aa|bb|(ab|ba)(aa|bb)*(ab|ba))*[cd]*$");
     }
 }