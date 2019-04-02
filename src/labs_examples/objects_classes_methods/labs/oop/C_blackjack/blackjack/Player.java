package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.Scanner;

public class Player {

    int chips;

    String name;
    Hand hand = new Hand();;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(int chips, String name) {
        this.chips = chips;
        this.name = name;
    }

    public void startWallet() {
        Scanner playerInput = new Scanner(System.in);
        System.out.print("How much money would you like to convert to chips? ");
        playerInput.nextInt();
    }

    public boolean computerAIWantsCard() {
        this.hand.printDealerHand();

        this.hand.updateHandValue();

        if (this.hand.handValue < 16) {
            System.out.println("The dealer deals itself another card.");
            return true;
        }
//        System.out.println("The dealer has decided to stay at " + this.hand.handValue + ".");
        return false;
    }

    public boolean humanWantsCard() {
        Scanner playerInput = new Scanner(System.in);
        System.out.print("Would you like to hit? (y or n) ");
        String playerChoice = playerInput.next();
        if (playerChoice.equals("y")) {
            System.out.println("You are dealt another card.");
            return true;
        } else {
            this.hand.updateHandValue();
            System.out.println("You have decided to stay at " + this.hand.handValue + ".");
            return false;
        }
    }

    public void printWallet() {
        System.out.println("You have " + this.chips + " dollars in chips.");
    }

    @Override
    public String toString() {
        return "Player{" +
                "chips=" + chips +
                ", name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }
}

//  5) In the Player class, create a method named computerAI that will return true if the computer player wants another card.
//  It will return false is the computer player does not want another card. If the computer player's hand currently has a
//  value less than 16 it will want another card. If the hand value is greater than or equal to 16 the computer will not
//  want another card.