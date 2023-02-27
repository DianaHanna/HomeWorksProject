package Class29HomeWork;

import java.util.HashSet;
import java.util.Set;

public class Student {
    public static void main(String[] args) {

        Set<Student> students=new HashSet<>(); // we can achieve polymorphism
        students.add(new Student("Daniel",123));
        students.add(new Student("Patrick",456));
        students.add(new Student("Karim",789));

        for (Student student:students) {
            System.out.println(student.getName());
        }
    }

    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}
