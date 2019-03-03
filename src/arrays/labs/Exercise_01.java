package arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        int sum = 0;
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < numbers.length - 1; i++) {

            System.out.print("Please enter a number: ");
            numbers[i] = userInput.nextInt();
            sum += numbers[i];

        }

        System.out.print("Please one last number: ");
        numbers[9] = userInput.nextInt();
        sum += numbers[9];
        double average = (double) sum / 10;

        System.out.println("The sum of the numbers you entered is: " + sum);
        System.out.println("The average of the numbers you entered is: " + average);

    }

}