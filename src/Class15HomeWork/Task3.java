package Class15HomeWork;

public class Task3 {
    /*
    Create a method that will print whether given String is palindrome or not.
    // return boolean
    // name Palindrome
    // parameter String
     */

    boolean isPalindrome(String word) {
        boolean isPalindrome=true;
        String reverse = new StringBuilder(word).reverse().toString();
        if (word.equals(reverse)) {
            return true;
        }else {
            return false;
    }

}

    public static void main(String[] args) {
        Task3 task3=new Task3();
        System.out.println(task3.isPalindrome("hello"));
    }
}
