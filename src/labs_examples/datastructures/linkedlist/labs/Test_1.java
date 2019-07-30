package labs_examples.datastructures.linkedlist.labs;

import java.util.Iterator;
import java.util.LinkedList;

public class Test_1 {

    import LinkedList


    class Main {
        public static void main(String[] args) {
            LinkedList<String> myList = new LinkedList();

            // demonstrate adding several elements to the LinkedList
            myList.add("one");
            myList.add("two");
            myList.add("three");
            myList.add("four");
            myList.add("five");

            // demonstrate retrieving one or more element from the LinkedList
            System.out.print(myList.get(3));

            // demonstrate removing several elements from the LinkedList
            myList.remove(4);
            myList.remove(3);


            // demonstrate at least 4 additional method calls against the LinkedList
            Iterator iter = myList.iterator();
            while(iter.hasNext()){
                System.out.print(iter.next() + " ");
            }

            iter = myList.descendingIterator();
            while(iter.hasNext()){
                System.out.print(iter.next());
            }

            System.out.print(myList.pop());

            String word = "two";
            boolean hasWord = myList.contains(word);
            System.out.println("List contains " + word + ":" + hasWord);



        }
    }

}
