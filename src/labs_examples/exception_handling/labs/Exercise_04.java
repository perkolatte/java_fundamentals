package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class tryCatchNestedExample {

    public static void main(String[]args) {

        int int1 = 55;
        int int2 = 0;
        double result;

        String string = "Hello!";
        char character;

        try {

            result = int1 / int2;

        } catch (ArithmeticException ae) {

            System.out.println("ArithmeticException: " + ae.toString());

            try {

                character = string.charAt(string.length() + 2);

            } catch (Exception e) {

                System.out.println("Exception: " + e.toString());
            }

        } finally {

            System.out.println("Test complete!");
        }

    }

}