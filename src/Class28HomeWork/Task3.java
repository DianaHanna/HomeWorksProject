package Class28HomeWork;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("space");
        words.add("variable");

        for (int i = words.size() - 1; i >= 0; i--) {
            if (words.get(i).endsWith("e")) {
                words.remove(i);
            }
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
