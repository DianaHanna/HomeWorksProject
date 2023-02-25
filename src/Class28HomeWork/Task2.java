package Class28HomeWork;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("VW");
        cars.add("Mercedes");

        for (String car:cars) {
            System.out.println(car);
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
    }
}
