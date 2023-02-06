package Class20HomeWork;

public class Circle extends Shape {
    Circle(double radius) {

        super(radius);
    }

    void areaOfCircle() {
        System.out.println(Math.PI * radius * radius);

    }

    public static void main(String[] args) {
        Circle circle = new Circle(12.3);
        circle.areaOfCircle();
    }
}