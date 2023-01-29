package Class13HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        String str = "Aygw udhi iWETR58918 998% @&%!^";

        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
    }
}
