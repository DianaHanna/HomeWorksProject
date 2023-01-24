package ArraysHW;

public class Task7 {
    public static void main(String[] args) {

        // )Write a java program to check whether a given number is prime or not?
        int number = 98;
        boolean condition = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                condition = true;
                break;
            }
        }
        if (!condition)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is NOT a prime number.");
    }
}
