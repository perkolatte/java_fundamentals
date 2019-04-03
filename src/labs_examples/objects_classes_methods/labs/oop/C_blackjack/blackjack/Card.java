package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Card {

    int cardValue;
    char suit;
    String cardName;

    public Card(String cardName) { // dealer hole card
        this.cardName = cardName;
    }

    public Card(char suit, String cardName) { // Ace could be 1 or 11
        this.suit = suit;
        this.cardName = cardName;
    }

    public Card(int cardValue, char suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    //face cards and aces
    public Card(int cardValue, char suit, String cardName) {
        this.cardValue = cardValue;
        this.suit = suit;
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        if (this.cardName != null) {
            if (this.cardName.equals("hidden")) {
                return "[hidden card]";
            } else {
                return cardName + " of " + suit;
            }
        } else {
            return cardValue + " of " + suit;
        }
    }
}
