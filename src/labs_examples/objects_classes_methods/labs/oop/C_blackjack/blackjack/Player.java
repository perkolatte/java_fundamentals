package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class Player {

    int wallet;

    String name;
    Hand hand = new Hand();;

    public Player() {
    }

    public Player(int wallet, String name) {
        this.wallet = wallet;
        this.name = name;
    }

    public boolean computerAI() {
        return hand.handValue < 16;
    }

    @Override
    public String toString() {
        return "Player{" +
                "wallet=" + wallet +
                ", name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }
}

//  5) In the Player class, create a method named computerAI that will return true if the computer player wants another card.
//  It will return false is the computer player does not want another card. If the computer player's hand currently has a
//  value less than 16 it will want another card. If the hand value is greater than or equal to 16 the computer will not
//  want another card.