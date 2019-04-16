package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class TryCatchExample {

    public static void main(String[] args) {

        int int1 = 55;
        int int2 = 0;
        int result;

        try {
            result = int1 / int2;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.toString());
        }

    }

}