import java.awt.*;

public class FizzBuzzTranslate {

    public static final int FIRSTNUM = 3;
    public static final int SECONDNUM = 5;

    public static String translate(int numberToCheck) {
        if (numberToCheck % FIRSTNUM == 0 && numberToCheck % SECONDNUM == 0) {
            return "FizzBuzz";
        }
        if (numberToCheck % FIRSTNUM == 0) {
            return "Fizz";
        }
        if (numberToCheck % SECONDNUM == 0) {
            return "Buzz";
        }
        if (numberInclude3(numberToCheck))
            return "Fizz";
        if (numberInclude5(numberToCheck))
            return "Buzz";
        return ""+numberToCheck;
    }

    public static boolean numberInclude3(int numberToString) {
        String newStringToCheck = Integer.toString(numberToString);
        for (int i = 0; i < newStringToCheck.length(); i++) {
            if (newStringToCheck.charAt(i)=='3') {
                return true;
            }
        }
          return false;

    }
    public static boolean numberInclude5(int numberToString) {
        String newStringToCheck = Integer.toString(numberToString);
        for (int i = 0; i < newStringToCheck.length(); i++) {
            if (newStringToCheck.charAt(i)=='5') {
                return true;
            }
        }
          return false;

    }
}
