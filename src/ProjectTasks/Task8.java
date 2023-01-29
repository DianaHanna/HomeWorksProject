package ProjectTasks;

public class Task8 {
    public static void main(String[] args) {

        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
        0 1 1 2 3 5 8 13 21 34
         */
        int a=0;
        int b=1;
        int c;
        for (int i = 0; i < 10; i++) {
            System.out.print(a+" ");
            c=a+b; // adding to get value to C
            a=b; // assign a value to b
            b=c; // assign b value to c

        }
    }
}
