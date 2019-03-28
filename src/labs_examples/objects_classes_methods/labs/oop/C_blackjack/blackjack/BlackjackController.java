package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        playBlackjack();

    }

    public static void playBlackjack() {

        Deck standardDeck = new Deck();
        //System.out.println(standardDeck.toString());

        Scanner playerInput = new Scanner(System.in);
        System.out.println("Let's play Blackjack!");
        System.out.print("What's your name? ");
        String playerName = playerInput.next();
        System.out.println("Hi " + playerName + " !");

        Player humanPlayer = new Player(100, playerName);
        Player computerPlayer = new Player("Artoo");

        standardDeck.shuffle();

        standardDeck.deal(humanPlayer);
        standardDeck.deal(humanPlayer);
        standardDeck.deal(computerPlayer);
        standardDeck.deal(computerPlayer);

        do {
            if (computerPlayer.computerAIWantsCard()) {
                standardDeck.deal(computerPlayer);
            }

            if (humanPlayer.humanWantsCard()) {
                standardDeck.deal(humanPlayer);
            }


        } while (computerPlayer.hand.isLessThan21() && humanPlayer.hand.isLessThan21());

        //Player bust
        //Dealer bust

        //Player wins
        //Dealer wins

        //Blackjack dealer
        //Blackjack player

        //Push(tie)

        if (computerPlayer.hand.isBlackjack() & humanPlayer.hand.isBlackjack()) { // ????
            System.out.println("Push: You tie with the dealer and your bet is returned to you.");
        }


    }
}
