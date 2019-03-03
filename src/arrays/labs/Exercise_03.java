package arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];
        int value = 3;

        for (int y = 0; y < twoDArray.length; y++) {

            for (int x = 0; x < twoDArray[y].length; x++) {

                twoDArray[y][x] = value;
                value += 3;

            }

        }

        for (int[] row : twoDArray) {

            for (int multipleOf3 : row) {

                System.out.print(multipleOf3 + " ");

            }

            System.out.println();

        }

    }
}
