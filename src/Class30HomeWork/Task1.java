package Class30HomeWork;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {

    public static void main(String[] args) {

        Map<Integer, String> bestBuyStore =new TreeMap<>();
        bestBuyStore.put(12345,"Lap Top");
        bestBuyStore.put(67890,"Printer");
        bestBuyStore.put(84854,"TV");
        bestBuyStore.put(99465,"iPhone");
        bestBuyStore.put(59877,"Speaker");

        var entrySet=bestBuyStore.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry);

        }

    }
}