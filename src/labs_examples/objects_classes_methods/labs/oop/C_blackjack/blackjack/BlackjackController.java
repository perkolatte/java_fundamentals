package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack;

public class BlackjackController {

    public static void main(String[] args) {

        Deck standardDeck = new Deck();
        Player humanPlayer = new Player(100, "Jeffro");
        Player computerPlayer = new Player(100, "Artoo");

        //System.out.println(standardDeck.toString());
        standardDeck.shuffle();

        System.out.println(humanPlayer.toString());


        do {
            standardDeck.deal(humanPlayer);
            System.out.println(humanPlayer.hand.toString());
        } while (humanPlayer.hand.handValue < 21);

    }

}
