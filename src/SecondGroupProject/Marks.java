package SecondGroupProject;

public abstract class Marks {

    int[] marks;

    public Marks(int[] marks) {
        this.marks = marks;
    }
    abstract double getPercentage();
}
class A extends Marks{
    public A(int[] marks) {
        super(marks);
    }

    @Override
    double getPercentage() {
        int sum=0;
        for (int mark:marks) {
            sum+=mark;
        }
        return sum/3.0;
    }
}
class B extends Marks{
    public B(int[] marks) {
        super(marks);
    }

    @Override
    double getPercentage() {
        int sum=0;
        for (int mark:marks) {
            sum+=mark;
        }
        return sum/4.0;
    }

    public static void main(String[] args) {

        int[] marksA={95,92,90};
        A a=new A(marksA);
        System.out.println(a.getPercentage());

        int[] marksB= new int[]{85, 88, 92, 90};
        B b=new B(marksB);
        System.out.println(b.getPercentage());
    }
}