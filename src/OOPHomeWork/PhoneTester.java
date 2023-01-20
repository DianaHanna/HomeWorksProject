package OOPHomeWork;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iPhone=new Phone();
        iPhone.name="iPhone";
        iPhone.color="Pink";
        iPhone.model="12 pro";
        iPhone.price=799.99;
        iPhone.sound();

        Phone Pixel=new Phone();
        Pixel.name="Pixel";
        Pixel.color="Grey";
        Pixel.model="Pixel7";
        Pixel.price=749.00;
        Pixel.ring();

        Phone Samsung=new Phone();
        Samsung.name="Samsung";
        Samsung.color="Silver";
        Samsung.model="Galaxy S22";
        Samsung.price=799.99;
        Samsung.sound();
    }
}
