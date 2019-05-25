package labs_examples.generics.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are subclasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a collection of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 *      5)
 */

class genericMethods {

    public static void main(String args[]) {

        // 1)
        int a = 76;
        float b = 121.2f;
        System.out.println("Sum of a and b: " + sum(a, b));

        // 2)
        ArrayList<String> possiblePalindromes = new ArrayList<>();
        possiblePalindromes.add("papaya");
        possiblePalindromes.add("racecar");
        possiblePalindromes.add("deed");
        possiblePalindromes.add("dad");
        possiblePalindromes.add("gopher");
        System.out.println("Number of palindromes found: " + numPalindromes(possiblePalindromes));

        // 3)
        String[] strings = {"one", "two", "three", "four", "five"};
        swap(0, 4, strings);
        System.out.println("The requested elements have been swapped: " + Arrays.toString(strings));

        // 4)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(-10);
        System.out.println("Largest number in the list: " + largestElement(numbers));

    }

    // 1)
    public static <A extends Number, B extends Number> double sum(A a, B b) {

        return a.doubleValue() + b.doubleValue();

    }

    // 2)
    public static <C extends Collection<String>> int numPalindromes(C collection) {

        int palindromeCount = 0;

        for (String string : collection) {

            String reversedString;
            int stringLength = string.length();
            boolean notPalindrome = false;

            for (int i = 0, j = stringLength - 1; i < stringLength / 2 && !notPalindrome; i++, j--){

                if (string.charAt(i) != string.charAt(j)) {
                    notPalindrome = true;
                } else if (i + 1 >= stringLength / 2) {
                    palindromeCount++;
                }

            }

        }

        return palindromeCount;

    }

    // 3)
    public static <T> void swap(int position1, int position2, T[] array) {

        T memory;

        memory = array[position1];

        array[position1] = array[position2];

        array[position2] = memory;

    }

    // 4)
    public static <T extends Number> double largestElement(List<T> list) {

        double largest  = list.get(0).doubleValue();

        for  (int i = 1; i < list.size(); i++) {

            double nextPossibleLargest = list.get(i).doubleValue();

            if (largest < nextPossibleLargest) {

                largest = nextPossibleLargest;

            }

        }

        return largest;

    }

}