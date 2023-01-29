package ProjectTasks;

public class Task3 {
    public static void main(String[] args) {

        // Create a 2D array of integer values. Print the sum of all numbers.

        int [][] numbers={{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) { // for(int [] nums:numbers){
            for (int j = 0; j < numbers[i].length; j++) { //for(int num:nums){
                sum += numbers[i][j];
            }
        }
            System.out.println("Total ="+sum);

        }

    }

