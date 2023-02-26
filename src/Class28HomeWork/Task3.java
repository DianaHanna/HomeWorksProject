package Class28HomeWork;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("space");
        words.add("variable");

        words.removeIf(x-> x.endsWith("e"));
        System.out.println(words);

            }
    }

