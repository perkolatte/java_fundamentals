package labs_examples.objects_classes_methods.labs.methods;

import labs_examples.objects_classes_methods.labs.objects.airplane.Bathroom;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class MethodTraining {

    public static void main(String[] args) {

        // 2)
        // pass by value
        int number2 = 3;
        method2(number2);
        System.out.println(number2 + " is still 3");

        // pass by reference
        Bathroom halfBath = new Bathroom(5, 2, 0, 2);
        halfBath.setTpRemaining(5);
        System.out.println(halfBath.toString());
        useARollOfTp(halfBath);
        System.out.println(halfBath.toString());

        // 3)
        System.out.println("The largest number entered is " + getLargest(1, 2, 4, 3) + ".");

        // 4)
        String word = "Supercalifragilisticexpialidocious";
        System.out.println("The word supercalifragilisticexpialidocious contains " + getNumConsonants(word) + " consonants.");

        // 5)
        printFrog();

        // 6)
        int number6 = 2019;
        isPrime(number6);

        // 7)
        int[] numbers7 = {2, 4, 6, 1};
        System.out.println(Arrays.toString(getRange(numbers7)));

        // 8)
        ArrayList<Integer> numsWithCommonFactors = getNumsWithCommonFactors(100, 3, 9);
        System.out.println(Arrays.toString(numsWithCommonFactors.toArray()));
        System.out.println(numsWithCommonFactors.size());

        // 9)
        int[] array9 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(array9)));

    }

    // 1) Demonstrate method overloading in this class
    void method1 ( int number){
    }
    void method1 ( int number, int number2){
    }

    // 2) Demonstrate the difference between "pass by value" and "pass by reference"
    // pass by value
    private static int method2 (int number) {
        int product = number * 40;
        System.out.println(number + " times 40 = " + product);
        return product;
    }

    // pass by reference
    private static void useARollOfTp(Bathroom bathroom) {
        bathroom.setTpRemaining(bathroom.getTpRemaining() - 1);
        System.out.println(bathroom.toString());
    }

    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    private static int getLargest(int num1, int num2, int num3, int num4) {
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        if (num4 > largest) {
            largest = num4;
        }

        return largest;
    }

    // 4) Write a method to count all consonants (the opposite of vowels) in a String
    private static int getNumConsonants (String word) {

        int consonantCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (!word.toLowerCase().substring(i, i + 1).matches("[aeiou]")) {
                consonantCount++;
            }
        }

        return consonantCount;

    }

    // 5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
    private static void printFrog() {
        System.out.print("     _    _\n" +
                "    (o)--(o)\n" +
                "   /.______.\\\n" +
                "   \\________/\n" +
                "  ./        \\.\n" +
                " ( .        , )\n" +
                "  \\ \\_\\\\//_/ /\n" +
                "   ~~  ~~  ~~");
        // from: https://asciiart.website/index.php?art=animals/frogs
        System.out.println();
    }

    // 6) Write a method that will determine whether or not a number is prime
    private static boolean isPrime(int number) {
        String formattedNumber = NumberFormat.getInstance(Locale.getDefault()).format(number);

        if (number % 2 == 0) {

            System.out.println("The number " + number + " is not prime.");
            return false;

        } else {

            for (int i = 3; i < number; i += 2) {

                if (number % i == 0) {
                    System.out.println("The number " + formattedNumber + " is not prime.");
                    return false;
                }
            }

        }

        System.out.println("The number " + formattedNumber + " is prime.");
        return true;
    }

    /*
    7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    which is passed in as an argument
    */
    private static int[] getRange(int[] array) {
        int lowest = array[0];
        int highest = array[0];

        for (int number : array) {
            if (number < lowest) {
                lowest = number;
            }
            if (number > highest) {
                highest = number;
            }
        }

        int[] range = {lowest, highest};
        return range;
    }

    /*
    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    length of the returned list
    */
    private static ArrayList<Integer> getNumsWithCommonFactors(int maxNum, int divisor1, int divisor2) {

        ArrayList<Integer> numsWithCommonFactors = new ArrayList<>();

        for (int i = 2; i <= 100; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                numsWithCommonFactors.add(i);
            }
        }

        return numsWithCommonFactors;

    }

    /*
    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    variable is used to temporarily store individual values in the array
    */
    private static int[] reverseArray(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            int memory = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = memory;

        }

        return array;
    }

}
