package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {

    Card[] cards = new Card[52];
    char[] suits = {'♠', '♦', '♥', '♣'};

    ArrayList<Integer> unusedCards = new ArrayList<>(); // ArrayList of indexes of cards not used


    public Deck() {
        //card index
        int i = 0;

        // Suits
        for (int s = 0; s < 4; s++) {

            // Value
            for (int v = 1; v <= 13; v++) {

                switch (v) {
                    case 1:
                        cards[i] = new Card(suits[s], "Ace");
                        break;
                    case 11:
                        cards[i] = new Card(10, suits[s], "Jack");
                        break;
                    case 12:
                        cards[i] = new Card(10, suits[s], "Queen");
                        break;
                    case 13:
                        cards[i] = new Card(10, suits[s], "King");
                        break;
                    default:
                        cards[i] = new Card(v, suits[s]);
                }

                i++;
            }

        }

    }

    /**
     * This method deals a card to the given player...
     * @param player
     */
    public void deal(Player player) {

        int bound = unusedCards.size(); // Current size of ArrayList of indexes of cards not used
        Random random = new SecureRandom();

        int cardIndex = random.nextInt(bound);
        Card card = this.cards[cardIndex];

        addCardToHand(player, card);

        player.hand.updateHandValue();

        this.unusedCards.remove(cardIndex);

    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            this.unusedCards.add(i);
            // Add logic to exclude cards already in play
            // potentially if, say, games played > 0
        }
    }

    public void addCardToHand(Player player, Card card) {
        if (card.cardName != null && card.cardName.equals("Ace")) {
            player.hand.aces.add(card); //Fix aces handling
        } else {
            player.hand.cards.add(card);
        }
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
