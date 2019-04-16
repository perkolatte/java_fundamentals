package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class TryCatchFinallyExample {

    public static void main(String[]args) {

        int int1 = 55;
        int int2 = 10;
        double result;

        String string = "Hello!";
        char character;

        try {
            result = int1 / int2;
            character = string.charAt(string.length() + 2);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException: " + ae.toString());
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        } finally {
            System.out.println("Test complete!");
        }

    }

}