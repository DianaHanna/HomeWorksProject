package Class15HomeWork;

public class Task5 {
    /*
    Write a method to return whether given number is prime or not?
    // return boolean
    // name isPrime
    // parameter int
     */

    boolean isPrime(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            return false;
        } else {

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return isPrime;
        }

    }


    public static void main(String[] args) {

        Task5 task5=new Task5();
        System.out.println(task5.isPrime(17));
    }
}
