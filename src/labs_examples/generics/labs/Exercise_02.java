package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

class arrayListSum {

    public static void main(String[] args) {

        ArrayList<Float> floats = new ArrayList<>();
        floats.add(1.1234f);
        floats.add(2.2345f);
        floats.add(3.3456f);
        System.out.println("Sum of floats: " + sumArrayList(floats));

    }

    private static <T extends Number> double sumArrayList(ArrayList<T> arrayList) {

        double sum = 0;

        for (T number : arrayList) {

            sum += number.doubleValue();

        }

        return sum;

    }

}