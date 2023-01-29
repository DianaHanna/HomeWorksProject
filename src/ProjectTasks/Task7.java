package ProjectTasks;

public class Task7 {
    public static void main(String[] args) {

        // )Write a java program to check whether a given number is prime or not?
        // prime number should be divisible by itself and 1 only (should be >1)
        int number = 3;
        boolean isPrime = true;
        if (number > 1) {
            for (int i = 2; i <number ; i++) {
                if (number%i==0){
                    isPrime=false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        System.out.println("Number "+number+" is Prime? "+isPrime);
        /*
        System.out.println("Please enter a number");
        int num= scan.nextInt();

        int count=0;

        for (int i = 1; i <= num ; i++) {
            if (num%i==0) {
                count++;
            }
        }

        if(count==2) {
            System.out.println("The given number is Prime");
        } else {
            System.out.println("The given number is Not Prime");
        }
         */
    }
}