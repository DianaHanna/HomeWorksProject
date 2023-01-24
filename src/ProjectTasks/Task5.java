package ProjectTasks;

public class Task5 {
    public static void main(String[] args) {

        /*
        Create a 2D array of integers. Develop a program which will calculate the sum of
         even and odd numbers for that array.
         */


        int sumEven = 0;
        int sumOdd = 0;


        int[][] num = {{5, 4, 8, 9, 7},
                {3, 7, 4, 10, 6},
                {12, 2, 1, 5, 14}
        };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    sumEven += num[i][j];
                }else if (num[i][j]%2!=0){
                    sumOdd+=num[i][j];
                }
                }
        }
            System.out.println("The sum of even numbers is: "+sumEven);
            System.out.println("The sum of odd numbers is: "+sumOdd);

            }
        }







