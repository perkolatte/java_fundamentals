package arrays.labs;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *  More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a number from 1-10: ");
        int number = userInput.nextInt();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == number) {
                System.out.println("The number " + number + " is located at index " + i + ".");
                break;
            }

        }

    }
}