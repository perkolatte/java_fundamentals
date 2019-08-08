package labs_examples.datastructures.hashmap.labs.Exercise_02;

import java.util.Set;

public class CustomHashMapController {

    public static void main(String[] args) {

        CustomHashMap<String, Integer> allKindsOfStuff = new CustomHashMap<>();

        allKindsOfStuff.saveItFerLater("doohickey", 10);
        allKindsOfStuff.saveItFerLater("thingamabob", 2);
        allKindsOfStuff.saveItFerLater("whatchmacallit", 5);
        allKindsOfStuff.saveItFerLater("gosh darned thing", 99);
        allKindsOfStuff.saveItFerLater("whatsit", 1000001);

        System.out.println("Scotty says our current capacity is: " + allKindsOfStuff.canSheTakeAnyMoreScotty());

        allKindsOfStuff.saveItFerLater("poopyshoe", 5);
        allKindsOfStuff.saveItFerLater("whizbanger", 99);
        allKindsOfStuff.saveItFerLater("humdinger", 1000001);

        System.out.println("Scotty says our current capacity is: " + allKindsOfStuff.canSheTakeAnyMoreScotty());

        System.out.println("A whatchmacallit is " + allKindsOfStuff.goFetch("whatchmacallit") + " long.");
        allKindsOfStuff.goFetch("doozie");

        allKindsOfStuff.searchAndDestroy("poopyshoe");
        allKindsOfStuff.goFetch("doozie");

    }

}
