package Class29HomeWork;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {

       LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Raleigh");
        cities.add("New York");
        cities.add("Chicago");
        cities.add("Apex");
        cities.add("Atlantic");

        cities.removeIf(city-> city.startsWith("A"));
        System.out.println(cities);
    }
}
