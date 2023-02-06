package Class20HomeWork;

public class FullTime extends Employee {
    String department;

    FullTime(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    void printDepartment() {
        System.out.println(department);
    }
}

