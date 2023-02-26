package Class28HomeWork;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Diana");
        names.add("Karim");
        names.add("Daniel");
        names.add("Patrick");
        names.add("Eilora");

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Patrick"));

        System.out.println(names.size());

        for (String name:names) {
            System.out.println(name);
        }
    }
}
