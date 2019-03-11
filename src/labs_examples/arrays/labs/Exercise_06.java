package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int memory = 0;

        for (int i = 0; i <= array.length / 2; i++) {
            memory = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = memory;
        }

        for (int number : array) {
            System.out.print(number + " ");
        }

        /*
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int memory = 0;

        for (int i = array.length - 1, j = 0; i >= array.length / 2; i--, j++) {
            memory = array[i];
            array[i] = array[j];
            array[j] = memory;
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
        */

    }

}
