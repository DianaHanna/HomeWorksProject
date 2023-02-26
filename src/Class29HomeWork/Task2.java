package Class29HomeWork;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {

        HashMap<Integer, String> students=new HashMap<>();
        students.put(123,"Daniel");
        students.put(456,"Patrick");
        students.put(789,"Diana");


        for (Object student:students.keySet()) {
            System.out.println(students.get(student));
        }
    }
}
