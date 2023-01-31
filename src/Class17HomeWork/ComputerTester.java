package Class17HomeWork;

public class ComputerTester {
    public static void main(String[] args) {

        Computer computer=new Computer("Lenovo Yoga6","Windows 10",999.99,32,15.6,"256GB");
        computer.printInfo();

        System.out.println("********************");

        Computer computer1=new Computer("HP EliteBook 645","Windows11Pro",1249.00,16,15.6,"512GB");
        computer1.printInfo();
    }
}
