package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);



        System.out.print("Please enter any english word: ");

        String word = userInput.next().toLowerCase();
        String letter = "";

        int i = 0;

        do {

            letter = Character.toString(word.charAt(i));
            i++;

        } while (i < word.length() && !letter.matches("[aeiou]"));

        if (letter.matches("[aeiou]")) {

            System.out.println("The first vowel in " + word + " is " + letter + ".");

        } else System.out.println("No vowels found.");


    }
}
