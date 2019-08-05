package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class Exercise_01 {

    public static void main(String[] args) {

        PriorityQueue<String> aQueue = new PriorityQueue<>();

        aQueue.add("thing 1");
        aQueue.add("thing 2");
        aQueue.add("thing 3");
        aQueue.add("thing 4");
        aQueue.add("thing 5");

        for (String thing : aQueue) {
            System.out.println(thing);
        }
        System.out.println();

        System.out.println(aQueue.peek() + "\n");

        System.out.println("aQueue contains thing 7? " + aQueue.contains("thing 7" + "\n"));

        System.out.println("thing 2 removed? " + aQueue.remove("thing 2") + "\n");

        for (String thing : aQueue) {
            System.out.println(thing);
        }
        System.out.println();

        System.out.println(aQueue.element() + "\n");

        aQueue.clear();

        for (String thing : aQueue) {
            System.out.println(thing);
        }

    }

}