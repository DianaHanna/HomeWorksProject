package ProjectTasks;

public class Task6 {
    public static void main(String[] args) {

        /*
        Write a program to swap 2 numbers without a temporary variable?
         */

       int a=10;
       int b=15;

       a=a+b;
       b=a-b;
       a=a-b;

        System.out.println("After swapping:"+ "a= "+a+ " and "+" b="+ b);
    }
}
