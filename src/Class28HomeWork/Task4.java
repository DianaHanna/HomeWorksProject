package Class28HomeWork;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("soda");
        drinks.add("beer");
        drinks.add("coffee");
        drinks.add("tea");

        for (int i = 0; i < drinks.size() ; i++) {
            String drink=drinks.get(i);
            if (drink.contains("a")|| drink.contains("e")){
                drinks.set(i, "water");
        }
        }
        System.out.println(drinks);
    }
}
