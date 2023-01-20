package ArraysHW;

public class Task4 {
    public static void main(String[] args) {

        /*
         Create a 2D array or integer type where you will store odd and even numbers.
          Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] numbers1:numbers) {
            for (int even:numbers1) {
                if (even%2==0){
                    System.out.println(even);
            }
        }
        }
        }
        
        
    }

    
