package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> unusedCards = new ArrayList<>(); //

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

        player.hand.cards.add(this.cards[cardIndex]); //
        this.unusedCards.remove(cardIndex);
        player.hand.handValue += this.cards[cardIndex].cardValue;

    }

    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            this.unusedCards.add(i);
        }
    }

//    2) Create a deal() method that will take in a Player object and "deal" that player a random card out of the deck. To get
//    the random card, generate a random number between 1 and 52 (inclusive). Then check the ArrayList of Integers to make sure
//    that random number is not in there. If it is, that means the card has already been drawn. You need to generate new random
//    numbers until you find a card that has not been drawn. If/when the random number has not yet been played add the card at the index
//    of random num from the Cards[] to the player's "Hand" ArrayList, then add that random number to the ArrayList<Integer>
//    called unusedCards in the Deck class. This unusedCards arraylist tracks the cards that have already been dealt.

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
