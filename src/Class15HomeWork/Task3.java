package Class15HomeWork;

import java.io.StringBufferInputStream;

public class Task3 {
    /*
    Create a method that will print whether given String is palindrome or not.
    // return void
    // name isPalindrome
    // parameter String inputStr
     */

    void isPalindrome(String inputStr) {
        StringBuilder stringBuilder=new StringBuilder(inputStr);
        stringBuilder.reverse();
        String reversedStr=stringBuilder.toString();
        if (inputStr.equals(reversedStr)) {
            System.out.println(inputStr+" is palindrome");
        }else {
            System.out.println(inputStr+" is NOT palindrome");
    }

}

    public static void main(String[] args) {

        Task3 task3=new Task3();
        //String result=task3.isPalindrome("Kaya"); we cannot assign void methods to variables
        // System.out.println(task3.isPalindrome("Kaya");); cannot use void methods in Println
        task3.isPalindrome("Kaya");
        }
    }
