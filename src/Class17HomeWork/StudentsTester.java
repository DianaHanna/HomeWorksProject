package Class17HomeWork;

public class StudentsTester {
    public static void main(String[] args) {

        Students students=new Students("Daniel",97.9,99.8,98.9);
        students.printInfo();

        Students students1=new Students("Patrick",96.2, 97.3,100);
        students1.printInfo();

        Students students2=new Students("Joseph",94.3, 92.5,95);
        students2.printInfo();

        Students students3=new Students("Jacob", 85.6, 95, 88.3);
        students3.printInfo();

        Students students4=new Students("Nofer", 93.1, 84, 86.5);
        students4.printInfo();
    }
}
