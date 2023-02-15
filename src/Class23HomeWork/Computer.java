package Class23HomeWork;

public class Computer {

    int storage;
    String processor;

    public void wifi(){
        System.out.println("All computers should have wi-fi connection");
    }
    public void printing(){

        System.out.println("All computers should be able to print");
    }
}
class Apple extends Computer {
    @Override
    public void wifi() {
        System.out.println("Apple has wi-fi connection");
    }
    public void keyboard(){
        System.out.println("Apple laptops have blacklist magic keyboard with touch ID");
    }
}
class Lenovo extends Computer {
    @Override
    public void wifi() {
        System.out.println("Lenovo has wi-fi connection");
    }
    public void keyboard(){
        System.out.println("Lenovo laptops have track point keyboards");
    }
}
class HP extends Computer {
    @Override
    public void wifi() {
        System.out.println("HP has wi-fi connection");
    }
    public void keyboard(){
        System.out.println("HP laptops have QWERTY keyboard");
    }
}
class Dell extends Computer {
    @Override
    public void wifi() {
        System.out.println("Dell wi-fi connection");
    }
    public void keyboard(){
        System.out.println("Dell laptops have also QWERTY keyboard");
    }
}