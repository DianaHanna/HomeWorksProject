package Class30HomeWork;

import java.util.Map;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {

        Map<Integer, Person> map=new TreeMap<>();
        Person person4=new Person("Dunn","Justin",35,60000.00);
        Person person1=new Person("Daniel", "Lee",40,75000.00);
        Person person3=new Person("John","Smith",20,50000.00);
        Person person2=new Person("Patrick", "King",25,100000.00);

        map.put(4,person4);
        map.put(1,person1);
        map.put(3,person3);
        map.put(2,person2);

        var entrySet=map.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry.getKey());
            entry.getValue().printDetails();

        }

    }
}
