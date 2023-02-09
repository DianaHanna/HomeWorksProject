package Class20HomeWork;

public class Shape {

    double radius;

    public Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape {
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