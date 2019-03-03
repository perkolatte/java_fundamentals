package arrays.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Spliterator;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> stuff = new ArrayList<>();

        stuff.add("a cat in a hat");
        stuff.add("thing 1");
        stuff.add("thing 2");
        stuff.add("three-handled family credenza");

        System.out.println("stuff ArrayList: ");
        for (String thing : stuff) {
            System.out.println(thing + " ");
        }
        System.out.println();

        // from: https://blog.rapid7.com/2015/10/28/java-8-introduction-to-parallelism-and-spliterator/
        Spliterator<String> stuffSpliterator = stuff.spliterator();
        System.out.println("stuffSpliterator characteristics: " + stuffSpliterator.characteristics() + " (ORDER, SORTED, SUBSIZED)");
        System.out.println("stuffSpliterator size estimate: " + stuffSpliterator.estimateSize());
        Spliterator<String> newPartition = stuffSpliterator.trySplit();
        System.out.println("stuffSpliterator newPartition estimated size: " + newPartition.estimateSize());
        System.out.println("stuffSpliterator original partition new estimated size: " + stuffSpliterator.estimateSize());

    }

}
