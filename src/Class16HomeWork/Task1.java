package Class16HomeWork;

public class Task1 {

 /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */

    // return type int
    // name arrSum
    // parameter int [] arr

    int arrSum(int [] arr){ // creating the object
        int sum=0; // method
        for (int num:arr) {
            sum+=num;

        }
        return sum;
    }

    public static void main(String[] args) { // access modifier public
        int[] arr={20,14,85,36};
        Task1 task1=new Task1();
        System.out.println(task1.arrSum(arr));

    }
}

