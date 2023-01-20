package OOPHomeWork;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        /*
        Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array
         using 2 different loops
         */

        String cars[][]={{"American","German","Korean","Italian"},
                         {"Lincoln","VW","Kia","Ferrari"}};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(Arrays.toString(cars[i]));
        }
        for (String []car:cars) {
            System.out.println(Arrays.toString(car));
        }
    }
}
