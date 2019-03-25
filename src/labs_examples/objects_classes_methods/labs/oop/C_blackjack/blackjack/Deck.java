package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> unusedCards = new ArrayList<>();

    char[] suits = {'♠', '♦', '♥', '♣'};

    public Deck() {
        //card index
        int i = 0;

        // Suits
        for (int s = 0; s < 4; s++) {

            // Value
            for (int v = 1; v <= 13; v++) {

                switch (v) {
                    case 1:
                        cards[i] = new Card(v, suits[s], "Ace");
                        break;
                    case 11:
                        cards[i] = new Card(v, suits[s], "Jack");
                        break;
                    case 12:
                        cards[i] = new Card(v, suits[s], "Queen");
                        break;
                    case 13:
                        cards[i] = new Card(v, suits[s], "King");
                        break;
                    default:
                        cards[i] = new Card(v, suits[s]);
                }

                i++;
            }

        }

    }

    public void deal(Player player) {

        int bound = unusedCards.size();
        Random random = new SecureRandom();

        int cardIndex = random.nextInt(bound);
        Card card = this.cards[cardIndex];
//        int cardIndex = random.nextInt(bound);

        if (card.cardValue != 1) {
            addCardToHand(player, card);

        } else if (player.hand.handValue == 10) { // Blackjack!
            makeAce11(player, card);
            addCardToHand(player, card);

        } else {
            Scanner userInput = new Scanner(System.in);
            System.out.print("You were dealt an Ace. Would you like it to be worth 1 or 11?");
            int answer = userInput.nextInt();

            if (answer == 11) {
                makeAce11(player, card);
                addCardToHand(player, card);
            } else {
                addCardToHand(player, card);
            }
        }

        this.unusedCards.remove(cardIndex);


    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            this.unusedCards.add(i);
        }
    }

    public void addCardToHand(Player player, Card card) {
        player.hand.cards.add(card);
        player.hand.handValue += card.cardValue;
    }

    public void makeAce11(Player player, Card card) {
        card.cardValue = 11;
    }

    @Override
    public String toString() {
        String deckString = "";
        for (Card card : cards) {
            deckString = deckString + card + "\n";
        }
        return deckString;
    }

    //    1) In the Deck.java class, create a method that will populate the Card[] with 52 unique Card object. The cards
    //    should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), four 2's
    //    (spades, hearts, diamonds, clubs), four 3's (spades, hearts, diamonds, clubs), ... up through Jacks, Queens and Kings
}
