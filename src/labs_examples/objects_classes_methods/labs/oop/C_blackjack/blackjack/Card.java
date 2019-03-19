package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Card {

    int cardValue;

    char[] suit = new char[]{'♠', '♦', '♥', '♣'};

    public Card() {
    }

    public Card(int cardValue, char[] suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }
}
