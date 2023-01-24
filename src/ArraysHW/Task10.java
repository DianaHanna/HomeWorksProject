package ArraysHW;

public class Task10 {
    public static void main(String[] args) {

        /*
        Write a java program to find the second largest number in the array?
         */
        int[] numbers = {50,60,40,35,89,120,15};
        int largest = 0;
        int secLargest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secLargest = largest;
                largest = numbers[i];

            } else if (numbers[i] > secLargest) {
                secLargest = numbers[i];
            }
        }
            System.out.println("Largest number is: " + largest);
        System.out.println("2nd largest number is: " + secLargest);
    }
}
