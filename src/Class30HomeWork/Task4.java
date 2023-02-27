package Class30HomeWork;

import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {

        LinkedHashSet<String> uniqueObject=new LinkedHashSet<>();
        uniqueObject.add("Hello");
        uniqueObject.add("Batch15");
        uniqueObject.add("Students");

        for (String str:uniqueObject) {
            System.out.print(str+" ");
        }
    }
}
