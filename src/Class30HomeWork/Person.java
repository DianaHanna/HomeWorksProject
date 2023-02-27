package Class30HomeWork;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;


        }
        void printDetails(){
            System.out.println("Name is :"+name+" "+lastName+", "+"Age is :"+age+" ,and salary is :"+salary);
        }
    }

