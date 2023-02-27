package Class30HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> integers=new ArrayList<>();
        integers.add(10);
        integers.add(12);
        integers.add(10);
        integers.add(12);
        integers.add(20);

        int sum=0;
        for (int i = 0; i <integers.size(); i++) {
            sum+=integers.get(i);
        }
        System.out.println(sum);
    }
}
