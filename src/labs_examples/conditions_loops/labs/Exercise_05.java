package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean userWishesToGoAgain = false;

        do {

            int low = 0;
            int high = 0;
            boolean entryIsInvalid = true;

            while (entryIsInvalid) {
                System.out.print("Please enter a number: ");
                low = userInput.nextInt();

                System.out.print("Please enter another number which is greater than the first: ");
                high = userInput.nextInt();

                if (high <= low) {
                    System.out.println("Invalid entry. The second number must be larger than the first. Please try again.");
                } else {
                    entryIsInvalid = false;
                }
            }


            int sum = 0;
            int numberOfNumbers = 0;

            for (int i = low; i <= high; i++) {
                sum += i;
                numberOfNumbers++;
            }

            double average = (double) sum / numberOfNumbers;

            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + average);

            boolean choiceIsInvalid = false;

            do {
                System.out.print("Go again? (y or n): ");
                String choice = userInput.next();
                switch (choice) {
                    case "y":
                        userWishesToGoAgain = false;
                        break;
                    case "n":
                        userWishesToGoAgain = false;
                        break;
                    default:
                        System.out.println("Invalid entry. Please try again.");
                        choiceIsInvalid = true;
                }
            } while (choiceIsInvalid);

        } while (userWishesToGoAgain);

        System.out.println("Ok! Have an interesting day! Buh bye now!");
    }

}
