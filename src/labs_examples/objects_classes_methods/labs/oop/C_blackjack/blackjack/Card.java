package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Card {

    int cardValue;
    char suit;
    String cardName;

    public Card(int cardValue, char suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    //face cards and aces
    public Card(int cardValue, char suit, String name) {
        this.cardValue = cardValue;
        this.suit = suit;
        this.cardName = name;
    }

    @Override
    public String toString() {
        if (cardName != null) {
            return cardName + " of " + suit;
        } else {
            return cardValue + " of " + suit;
        }
    }
}
