package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Hand {

    int handValue;
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Card> aces = new ArrayList<>();

    public Hand() {
    }

    public boolean isNotBust() {
        return this.handValue <= 21;
    }

    public boolean isBust(int total) {
        return total > 21;
    }

    public boolean isBlackjack() {
        return this.handValue == 21;
    }

    public void updateHandValue() {
        int total = 0;

        for (Card card : cards) {
            total += card.cardValue;
        }

        for (Card ace : aces) {
            if (isBust(total + 11)) {
                total++; // Ace is one
            } else {
                total += 11; // Ace is 11
            }
        }

        this.handValue = total;
    }

    public void printHand() {
        System.out.print("Your hand: ");
        System.out.println(this.toString() + "\n");
    }

    /**
     * Creates and prints a version of the dealer's hand which shows the first card dealt as hidden.
     */
    public void printDealerHand() {
        ArrayList<Card> dealerHandDisplay = new ArrayList<>();
        Card hidden = new Card("hidden");
        dealerHandDisplay.add(hidden);
        for (int i = 1; i < this.cards.size(); i++) {
            dealerHandDisplay.add(this.cards.get(i));
        }
        System.out.println("Dealer's hand: " + dealerHandDisplay.toString() + "\n");
    }

    @Override
    public String toString() {
        return cards.toString() + aces.toString();
    }
}