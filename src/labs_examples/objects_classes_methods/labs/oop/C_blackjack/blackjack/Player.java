package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Player {

    int wallet;

    String name;
    Hand hand;

    public Player() {
    }

    public Player(int wallet, String name, Hand hand) {
        this.wallet = wallet;
        this.name = name;
        this.hand = hand;
    }
}
