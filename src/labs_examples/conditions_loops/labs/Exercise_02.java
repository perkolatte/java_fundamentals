package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner
        Scanner userInput = new Scanner(System.in);

        // 2) prompt user
        System.out.print("Please, enter a number from 1-7: ");

        // 3) assign input to variable as int
        int dayNumber = userInput.nextInt();

        // 4) write completed code here
        boolean unsuccessful = true;

        while (unsuccessful) {
                if (dayNumber == 1) {
                    System.out.println("Sunday");
                    unsuccessful = false;
                } else if (dayNumber == 2) {
                    System.out.println("Monday");
                    unsuccessful = false;
                    break;
                } else if (dayNumber == 3) {
                    System.out.println("Tuesday");
                    unsuccessful = false;
                    break;
                } else if (dayNumber == 4) {
                    System.out.println("Wednesday");
                    unsuccessful = false;
                    break;
                } else if (dayNumber == 5) {
                    System.out.println("Thursday");
                    unsuccessful = false;
                    break;
                } else if (dayNumber == 6) {
                    System.out.println("Friday");
                    unsuccessful = false;
                    break;
                } else if (dayNumber == 7) {
                    System.out.println("Saturday");
                    unsuccessful = false;
                    break;
                } else {
                    userInput = new Scanner(System.in);
                    System.out.print("Not a valid entry. Please, enter a number from 1-7: ");
                    dayNumber = userInput.nextInt();
                }
        }
    }
}
