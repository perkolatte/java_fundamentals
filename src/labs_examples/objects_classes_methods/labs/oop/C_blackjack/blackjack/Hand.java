package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.ArrayList;

public class Hand {

    int handValue;
    ArrayList<Card> cards = new ArrayList<Card>();


    public Hand() {
    }

    public boolean isLessThan21() {
        return this.handValue < 21;
    }

    public boolean isBlackjack() {
        if (this.cards.size() == 2 && this.handValue == 21) {
            for (Card card : cards) {
                if (card.cardName.equals("Ace")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}