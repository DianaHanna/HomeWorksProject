package Class22HomeWork;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest){ // constructor helps us to create the instance fields
        this.balance=balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        System.out.println("The interest rate is " + (balance * interest) / 100);
    }

    public static class Visa extends CreditCard {
        public Visa(double balance, double interest) {
            super(balance, interest);
        }
    }
    public static class AX extends CreditCard {

        public AX(double balance, double interest) {
            super(balance, interest);

        }
       public void calculateInterest() {
            System.out.println("Interest rate is " + (balance * interest) / 100+50);
        }
    }
}

