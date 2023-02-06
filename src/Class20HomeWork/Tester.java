package Class20HomeWork;

public class Tester extends FullTime {
    int workedHours;

    Tester(String name, String id, String department, int workedHours, int experience) {
        super(name, id, department);
        this.workedHours = workedHours;
    }

    public void printWorkedHours() {
        System.out.println(workedHours);
    }


    public static void main(String[] args) {

        Employee employee=new Employee("Adam","H1234");
        employee.printName();
        employee.printId();

        FullTime fullTime=new FullTime("John", "K456","Housekeeping");
        fullTime.printDepartment();
        fullTime.printId();
        fullTime.printName();

        PartTime partTime=new PartTime("Daniel","H1452",5);
        partTime.printExperience();
        partTime.printId();
        partTime.printName();

        Tester tester=new Tester("Mani","M123","Front Office",50,6);
        tester.printId();
        tester.printWorkedHours();
        tester.printName();
        tester.printDepartment();

    }
}
