package Class17HomeWork;

public class Computer {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    
    String model;
    String operatingSystem;
    double price;
    double screenSize;
    double ram;
    String ssdStorage;

    Computer(String computerModel, String computerOperatingSystem, double computerPrice, double computerScreenSize, double computerRam, String computerSsdStorage){
        model=computerModel;
        operatingSystem=computerOperatingSystem;
        price=computerPrice;
        screenSize=computerScreenSize;
        ram=computerRam;
        ssdStorage=computerSsdStorage;
    }

    void printInfo(){
        System.out.println("Model "+model);
        System.out.println("Operating System "+operatingSystem);
        System.out.println("Price "+price);
        System.out.println("Screen Size "+screenSize);
        System.out.println("Ram "+ram);
        System.out.println("SSD Storage "+ssdStorage);

    }

}
