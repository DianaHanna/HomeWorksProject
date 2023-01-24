package ProjectTasks;

public class Task8 {
    public static void main(String[] args) {

        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
         */
        int a=0;
        int b=1;
        int c;
        for (int i = 0; i < 10; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;

        }
    }
}
