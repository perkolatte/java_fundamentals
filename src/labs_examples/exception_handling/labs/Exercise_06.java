package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class ThrowAndCatchExample {

    public static void main(String[] args) {

        try {

            thrower(1, 0);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException caught!");

        }

    }

    private static int thrower(int a, int b) throws ArithmeticException{

        return a / b;

    }

}