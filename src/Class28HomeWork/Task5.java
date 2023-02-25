package Class28HomeWork;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 1; i <500; i+=2) {
            numbers.add(i);
        }
        for (int i = numbers.size()-1; i >=0 ; i--) {
            if (numbers.get(i)%5==0){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}
