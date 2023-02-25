package Class28HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {

   private String insuranceName;
   public Insurance(String insuranceName){
       this.insuranceName=insuranceName;
   }
   public String getInsuranceName(){
       return insuranceName;
   }
    public abstract double getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance{
   private String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }
    public String getCarModel(){
        return carModel;
}
    @Override
    public double getQuote() {
        return 350.0;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Insurance can be cancelled after 6 months");
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }
    public String getPetType(){
        return petType;
    }
    @Override
    public double getQuote() {
        return 150.0;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Insurance can be cancelled after 3 months");
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public double getQuote() {
        return 500.00;
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Insurance cannot be cancelled");
    }

    public static void main(String[] args) {

        ArrayList<Insurance> insurances=new ArrayList<>();
        Car car=new Car("Auto insurance","VW Taos");
        Pet pet=new Pet("Pet insurance", "Cat");
        Health health=new Health("Health insurance");
        insurances.add(car);
        insurances.add(pet);
        insurances.add(health);

        for (Insurance insurance:insurances) {
            System.out.println(insurance.getInsuranceName());
            System.out.println(insurance.getQuote());
            insurance.cancelInsurance();
            System.out.println();
        }
        for (int i = 0; i < insurances.size() ; i++) {
            Insurance insurance=insurances.get(i);
            System.out.println(insurance.getInsuranceName());
            System.out.println(insurance.getQuote());
            insurance.cancelInsurance();
            System.out.println();
        }
        Iterator<Insurance> insuranceIterator=insurances.iterator();
        while (insuranceIterator.hasNext()){
            Insurance insurance=insuranceIterator.next();
            System.out.println(insurance.getInsuranceName());
            System.out.println(insurance.getQuote());
            insurance.cancelInsurance();
            System.out.println();
        }


    }
}
