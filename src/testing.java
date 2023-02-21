import java.util.regex.Matcher;
import java.util.*;
import java.util.regex.Pattern;


public class testing {
    public static void main(String[] args) throws Exception {
        System.out.println("The word you type is a valid email: " + isEmail("agustin0yaopisdcozxczx@czxczxczxczx.com"));
        System.out.println("The word you type is a valid email: " + isEmail("agustin0yaopisdcozxczxczxczxczxczx.com"));
        System.out.println("The word you type is a valid email: " + isFloatingPoint("5"));
        System.out.println("The word you type is a valid email: " + isFloatingPoint("-.5"));
        System.out.println("The word you type is a valid email: " + isInteger("5"));
        System.out.println("The word you type is a valid email: " +  isInteger("-.5"));


    }

    public static boolean isEmail(String email) {
        return email.matches(
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }
    
    public static boolean isFloatingPoint(String number) {
        return number.matches(
            "^[+-]?([0-9]*[.])?[0-9]+$");
    }

    public static boolean isInteger(String number) {
        return number.matches(
            "^[+-]?[0-9]+$");
    }
}
