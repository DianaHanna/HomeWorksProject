package Class15HomeWork;

public class Task2 {

    /*
    Create a method that will take a number and prints whether the number is even or odd.

    // return boolean
    // name evenOdd
    // parameter int
     */

    boolean evenOdd(int number) {
        boolean evenOdd=true;
        if (number % 2 == 0) {
           return evenOdd;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Task2 task2=new Task2();
        System.out.println(task2.evenOdd(14));
    }
}

