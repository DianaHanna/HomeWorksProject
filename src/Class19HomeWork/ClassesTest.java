package Class19HomeWork;

public class ClassesTest {
    public static void main(String[] args) {

        ClassA classA=new ClassA();
        classA.subject="Math";
        classA.teacher="John";
        classA.understandingLevel();

        System.out.println(classA.subject);
        System.out.println(classA.teacher);

        System.out.println(" --- Creating an object from Class B --- ");

        ClassB classB=new ClassB();
        classB.subject="ELA";
        classB.teacher="Emily";
        classB.score=95;
        classB.understandingLevel();
        classB.goodScore();

        System.out.println(classB.subject);
        System.out.println(classB.teacher);
        System.out.println(classB.score);

        System.out.println(" --- Creating an object from Class C --- ");

        ClassC classC=new ClassC();
        classC.courseDuration=6;

        classC.howLong();

        System.out.println(classC.courseDuration);
    }
}
