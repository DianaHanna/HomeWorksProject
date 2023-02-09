package Class22HomeWork;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balanace, double interest){
        this.balance=balanace;
        this.interest = interest;
    }

    void calculateInterest() {
        System.out.println("The interest rate is " + balance * interest / 100);
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

        void calculateInterest() {
            System.out.println("Interest rate is " + balance * interest / 100);
        }
    }
}

