package ProjectTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);

    /*
      Using Scanner create an array of integer values. After the array is created, calculate the sum of all
      stored elements in that array.
 */
        int [] numbers= new int[4];
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
            sum=sum+numbers[i];

        }
        System.out.println(sum);
    }
}
