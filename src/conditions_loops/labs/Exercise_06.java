package conditions_loops.labs;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i < 101) {

            sum += i;
            i++;

        }

        if (sum > 999 || sum < -999) {

            NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
            String sumWithCommas = (String) numberFormat.format(sum);
            System.out.println("The sum of all numbers from 1 to 100 is " + sumWithCommas + ".");

        } else System.out.println("The sum of all numbers from 1 to 100 is " + sum + ".");

    }

}
