package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {
        int number = 5;
        int x = factorial(number);
        System.out.println("Factorial " + number + " is equal to " + x + ".");
    }

    private static int factorial(int number) {

        int factorialInProgress;

        while (number != 1) {

            factorialInProgress = number * factorial(number - 1);
            return factorialInProgress;

        }

        return 1;

    }


}

