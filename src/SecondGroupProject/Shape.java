package SecondGroupProject;

public interface Shape {

    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }


    public static void main(String[] args) {
        Shape circle=new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println( circle.calculatePerimeter());

        Shape square=new Square(6);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}