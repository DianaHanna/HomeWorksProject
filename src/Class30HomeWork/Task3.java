package Class30HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<String, Double> employee=new LinkedHashMap<>();
        employee.put("John Smith",100000.00);
        employee.put("Dan Justin", 85000.00);
        employee.put("Natalie Lee", 90000.00);

        String highestEmployee=null;
        double highestSalary=Double.MIN_VALUE;


        var entrySet=employee.entrySet();
        for (var entry:entrySet) {
            if (entry.getValue()>highestSalary){
                highestSalary= entry.getValue();
                highestEmployee= entry.getKey();
            }
        }
        System.out.println(highestEmployee+" =$"+highestSalary);
    }
}
