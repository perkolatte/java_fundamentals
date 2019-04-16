package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class ThrowerExample {

    public static void main(String[] args) {

        thrower(60, 0);

    }

    private static int thrower(int a, int b) {

        return a / b;

    }

}