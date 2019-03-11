package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int four = 2 + 2;
        int three = four - 1;
        int two = (int) (0.67 * three);
        int one = two / two;
        int zero = one % one;

        System.out.println("four = " + four);
        System.out.println("three = " + three);
        System.out.println("two = " + two);
        System.out.println("one = " + one);
        System.out.println("zero = " + zero);

    }

}
