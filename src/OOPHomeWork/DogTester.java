package OOPHomeWork;

public class DogTester {
    public static void main(String[] args) {

        Dog Husky=new Dog();
        Husky.name="Leo";
        Husky.age=5;
        Husky.breed="Serbian";
        Husky.attitude=true;
        Husky.color="Grey";
        Husky.eat();

        Dog BullDog=new Dog();
        BullDog.name="Whisky";
        BullDog.color="White&Brown";
        BullDog.breed="British";
        BullDog.sound();

        Dog Labrador=new Dog();
        Labrador.name="Rocky";
        Labrador.breed="British";
        Labrador.color="Black";
        Labrador.age=2;
    }
}
