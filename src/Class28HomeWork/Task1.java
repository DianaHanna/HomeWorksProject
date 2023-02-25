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

        boolean isEmpty=names.isEmpty();
        System.out.println(isEmpty);

        String searchName="Patrick";
        boolean isPresent=names.contains(searchName);
        System.out.println(isPresent);

        int size=names.size();
        System.out.println(size);

        for (String name:names) {
            System.out.println(name);
        }
    }
}
