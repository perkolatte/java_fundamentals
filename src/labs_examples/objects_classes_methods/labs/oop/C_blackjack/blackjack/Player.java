package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.Scanner;

public class Player {

    int wallet;

    String name;
    Hand hand = new Hand();;

    public Player(String name) {
        this.name = name;
    }

    public Player(int wallet, String name) {
        this.wallet = wallet;
        this.name = name;
    }

    public boolean computerAIWantsCard() {
        System.out.println("The dealer's hand is worth " + this.hand.handValue + " and consists of the following cards:");
        System.out.println(this.hand.toString());

        if (this.hand.handValue < 16) {
            System.out.println("The dealer deals itself another card.");
            return true;
        }
        System.out.println("The dealer has decided to stay at " + this.hand.handValue + ".");
        return false;
    }

    public boolean humanWantsCard() {
        Scanner playerInput = new Scanner(System.in);
        System.out.println("Your hand is worth " + this.hand.handValue + " and consists of the following cards:");
        System.out.println(this.hand.toString());

        System.out.print("Would you like another card? (y or n)");
        String playerChoice = playerInput.next();
        return playerChoice.equals("y");
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