package Class22HomeWork;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard(100.00, 15.0);
        creditCard.calculateInterest();

        CreditCard.Visa visa=new CreditCard.Visa(150.00, 12.00);
        visa.calculateInterest();

        CreditCard.AX ax = new CreditCard.AX(100.00,20.00);
        ax.calculateInterest();
        }
    }

