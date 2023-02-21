package SecondGroupProject;

public class Car {

    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
       if (length>20){
           return super.calculateSalePrice() * 0.95;
       }else {
           return super.calculateSalePrice() * 0.9;
       }
    }
}
class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    public double calculateSalePrice() {
        if (weight>2000){
            return super.calculateSalePrice() * 0.9;
        }else {
            return super.calculateSalePrice() * 0.8;
        }
    }

    public static void main(String[] args) {

        Car sedan=new Sedan(35000.0,"White", 18.0);
        System.out.println(sedan.calculateSalePrice());

        Car truck=new Truck(45500.0,"Grey",150.0);
        System.out.println(truck.calculateSalePrice());
    }
}