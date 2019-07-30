package labs_examples.datastructures.linkedlist.labs;

import labs_examples.input_output.examples.FileReaderAndBufferExample;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

class Exercise_01 {

    public static void main(String[]args) {

        // 1) create a LinkedList (from Java's libraries)
        LinkedList<String> aList = new LinkedList<>();
        System.out.println(aList.toString());

        // 2) add()
        aList.add("item 1");
        aList.add("item 2");
        System.out.println(aList.toString());

        // 3) addAll()
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("zero");
        numbers.add("one");
        numbers.add("two");

        aList.addAll(numbers);
        System.out.println(aList.toString());

        // 4) addFirst()
        aList.addFirst("real first item");
        System.out.println(aList.toString());

        // 5) addLast()
        aList.addLast("real last item");
        System.out.println(aList.toString());

        // 6) getFirst()
        System.out.println(aList.getFirst());

        // 7) getLast()
        System.out.println(aList.getLast());

        // 8) get()
        System.out.println(aList.get(4));

        // 9) set()
        aList.set(2, "new item 4");
        System.out.println(aList);

        // 10) push() (same as addFirst)
        aList.push("real, real first item");
        System.out.println(aList);

        // 11) pop()
        System.out.println(aList.pop());
        System.out.println(aList);


        // 12) remove()
        aList.remove(0);
        System.out.println(aList);

        // 13) contains()
        System.out.println(aList.contains("two"));

        // 14) listIterator()
        System.out.println(aList.listIterator());

        // 15) clear()
        aList.clear();
        System.out.println(aList);
    }

}