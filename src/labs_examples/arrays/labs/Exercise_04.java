package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] pyramid = new int[4][];
        pyramid[0] = new int[1];
        pyramid[1] = new int[2];
        pyramid[2] = new int[3];
        pyramid[3] = new int[4];
        int value = 10;

        for (int y = 0; y < pyramid.length; y++) {
            for (int x = 0; x < pyramid[y].length; x++) {
                pyramid[y][x] = value;
                value--;
            }
        }

        for (int[] level : pyramid) {
            for (int block : level) {
                System.out.print(block + " ");
            }
            System.out.println();
        }

    }


}
