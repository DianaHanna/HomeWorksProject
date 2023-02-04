package Class17HomeWork;

public class Car {

    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private, public, default, protected) and create 4 objects of this class: 1 - inside same class; 
    2 - from outside the class; 3 - from different class inside different package  and observe result.
     */
    
    String model;
    String color;
    int year;
    double price;

    private Car (String CarModel, String CarColor, int CarYear, double CarPrice){
        model=CarModel;
        color=CarColor;
        year=CarYear;
        price=CarPrice;


    }
    Car (){

    }
    protected Car(String carColor, String carModel, double carPrice){
        color=carColor;
        model=carModel;
        price=carPrice;
    }
    public Car (String carModel, String carColor){
        model=carModel;
        color=carColor;
    }

    public void printInfo(){
        System.out.println("Car Model: "+model+" Car Color: "+color+" Car Year: "+year+" Car Price: "+price);
    }
    public static void main(String[] args) {

        Car car=new Car("Toyota", "White", 2023, 32.000);
        car.printInfo();
        Car car1=new Car();
        car1.printInfo();
        Car car2=new Car("Honda","Black",2021, 55.000);
        car2.printInfo();
        Car car3=new Car("Meserati","Red",2023,78.000);
        car3.printInfo();
        }
    }

