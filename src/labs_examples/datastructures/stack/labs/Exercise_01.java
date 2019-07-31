package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

class Exercise_01 {

    public static void main(String[] args) {

        Stack<Integer> plates = new Stack<>();

        plates.push(1);
        plates.push(2);
        plates.push(3);
        plates.push(4);
        plates.push(5);
        System.out.println("plates stack: " + plates.toString());

        plates.pop();
        System.out.println("plates stack: " + plates.toString());

        System.out.println("top plate in stack: " + plates.peek());

        System.out.println("number of plates in stack: " + plates.size());

        System.out.println("out of plates: " + plates.empty());

        System.out.println("index of plate 3 in stack: " + plates.search(3));

    }

}