package Class17HomeWork;

public class CarTester {
    public static void main(String[] args) {
        Car c=new Car("Toyota", "White", 2023);
        c.printInfo();
        Car c1=new Car();
        c1.printInfo();
        Car c2=new Car("Honda","Black");
        c2.printInfo();
        Car c3=new Car("Meserati","Red");
        c3.printInfo();
    }
}
