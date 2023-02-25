package Class28HomeWork;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    private double interestRate;
    private String cardType;

    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String print(){
        return cardType+" "+interestRate+" %";
    }

    public static void main(String[] args) {

        LinkedList<Card> cards=new LinkedList<>();
        Card card1=new Card(6.9, "Mastercard");
        Card card2=new Card(8.5,"Visa");
        Card card3=new Card(10, "Amex");
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        for (Card card:cards) {
            System.out.println(card.print());
        }
        for (int i = 0; i < cards.size() ; i++) {
            Card card=cards.get(i);
            System.out.println(card.print());
        }
        Iterator<Card> iterator=cards.iterator();
        while (iterator.hasNext()){
            Card card=iterator.next();
            System.out.println(card.print());
        }
    }
}

