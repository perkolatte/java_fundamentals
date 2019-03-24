package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.ArrayList;

public class Hand {

    int handValue;

    ArrayList<Card> cards = new ArrayList<Card>();

    public Hand() {
    }

    public boolean isGreaterThan21() {
        return handValue > 21;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handValue=" + handValue +
                ", cards=" + cards +
                '}';
    }
}


//  4) In the Hand class, create a method that will return true if the hand value is greater than 21 and false if the hand
//  value is less than 21