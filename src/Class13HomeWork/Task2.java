package Class13HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        String str="Aygw udhi iWETR58918 998% @&%!^";
        int alphanumericCount = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            alphanumericCount++;
        }
        System.out.println("The number of alphanumeric characters in the string is: " + alphanumericCount);
            }
}
