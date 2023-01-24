package ProjectTasks;

public class Task9 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in the array?
         */

        int[] numbers={10,2,15,8,3};
        int max=0;
        int min=numbers.length;

        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];

            }
        }
        System.out.println("The maximum number is:" +max);

        System.out.println("The minimum number is:" +min);
    }
}
