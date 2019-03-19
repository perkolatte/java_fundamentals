package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.ArrayList;

public class Hand {

    int handValue;

    ArrayList<Card> cards;

    public Hand() {
    }

    public Hand(int handValue, ArrayList<Card> cards) {
        this.handValue = handValue;
        this.cards = cards;
    }
}
