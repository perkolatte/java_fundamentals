package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        playBlackjack();

    }

    public static void playBlackjack() {

        Deck standardDeck = new Deck();
//        boolean dealerContinuesPlaying = true;
//        boolean humanContinuesPlaying = true;
        boolean playerBust = false;
        boolean dealerBust = false;

        Scanner playerInput = new Scanner(System.in);
        System.out.println("Let's play Blackjack!");
        System.out.println("Dealer must draw to 16, and stand on all 17's" + "\n");
        System.out.print("What's your name? ");
        String playerName = playerInput.next();
        System.out.println("Hi " + playerName + "!" + "\n");

        Player humanPlayer = new Player(100, playerName);
        Player dealer = new Player("Artoo");

        standardDeck.shuffle();

        do {
            humanPlayer.hand = new Hand();
            dealer.hand = new Hand();

            standardDeck.deal(humanPlayer);
            standardDeck.deal(humanPlayer);
            standardDeck.deal(dealer);
            standardDeck.deal(dealer);

            humanPlayer.hand.printHand();
            dealer.hand.printDealerHand();

            if (humanPlayer.hand.isBlackjack()) {
                if (dealer.hand.isBlackjack()) {
                    System.out.println("Push: You tie with the dealer and your bet is returned to you.");
                } else {
                    System.out.println("Blackjack! You win!");
                    // 3 to 2 payout handling
                }
            } else {


                do { //player plays

                    if (humanPlayer.humanWantsCard()) {
                        standardDeck.deal(humanPlayer);
                        humanPlayer.hand.printHand();
                    } else {
                        break;
                    }

                } while (humanPlayer.hand.isNotBust());

                while (dealer.hand.isNotBust() && humanPlayer.hand.isNotBust()) { //dealer plays

                    if (dealer.computerAIWantsCard()) {
                        standardDeck.deal(dealer);
                        dealer.hand.toString();
                    } else {
                        break;
                    }
                }

                //Player bust
                if (!humanPlayer.hand.isNotBust()) {
                    playerBust = true;
                }
                //Dealer bust
                if (!dealer.hand.isNotBust()) {
                    dealerBust = true;
                }

                System.out.println("Dealer's hand: " + dealer.hand.toString());
                System.out.println("Your hand: " + humanPlayer.hand.toString());
                if (playerBust && dealerBust) {
                    System.out.println("Both players have busted!");
                    //payout handling
                } else if (playerBust && !dealerBust) {
                    System.out.println("You bust!");
                    //payout handling
                } else if (!playerBust && dealerBust) {
                    System.out.println("You win! Dealer bust!");
                    //payout handling
                } else if (humanPlayer.hand.handValue == dealer.hand.handValue) {
                    System.out.println("Push: You tie with the dealer and your bet is returned to you.");
                    //payout handling
                } else {
                    System.out.println(humanPlayer.hand.handValue > dealer.hand.handValue ? "You win!" : "You lose! :("); //no one busts
                    //payout handling
                }

                //Blackjack dealer
                //Blackjack player
            }

        } while (playerWantsToPlayAgain());
    }

    public static boolean playerWantsToPlayAgain() {
        Scanner playerInput = new Scanner(System.in);
        System.out.print("Play another round? (y or n) ");
        String playerChoice = playerInput.next();
        System.out.println();
        return playerChoice.equals("y");
    }
}
