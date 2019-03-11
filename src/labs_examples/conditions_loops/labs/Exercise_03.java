package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main (String[] args) {

        // 1) create scanner
        Scanner userInput = new Scanner(System.in);

        // 2) prompt user
        System.out.print("Please, enter a number from 1-12: ");

        // 3) assign input to variable as int
        int monthNumber = userInput.nextInt();

        // 4) write completed code here
        boolean unsuccessful = true;

        while (unsuccessful) {
            switch (monthNumber) {
                case 1:
                    System.out.println("January");
                    unsuccessful = false;
                    break;
                case 2:
                    System.out.println("February");
                    unsuccessful = false;
                    break;
                case 3:
                    System.out.println("March");
                    unsuccessful = false;
                    break;
                case 4:
                    System.out.println("April");
                    unsuccessful = false;
                    break;
                case 5:
                    System.out.println("May");
                    unsuccessful = false;
                    break;
                case 6:
                    System.out.println("June");
                    unsuccessful = false;
                    break;
                case 7:
                    System.out.println("July");
                    unsuccessful = false;
                    break;
                case 8:
                    System.out.println("August");
                    unsuccessful = false;
                    break;
                case 9:
                    System.out.println("September");
                    unsuccessful = false;
                    break;
                case 10:
                    System.out.println("October");
                    unsuccessful = false;
                    break;
                case 11:
                    System.out.println("November");
                    unsuccessful = false;
                    break;
                case 12:
                    System.out.println("December");
                    unsuccessful = false;
                    break;
                default:
                    userInput = new Scanner(System.in);
                    System.out.print("Not a valid entry. Please, enter a number from 1-12: ");
                    monthNumber = userInput.nextInt();
            }
        }
    }
}
