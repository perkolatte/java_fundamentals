package labs_examples.lambdas.labs;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_02 {

    public static void main(String[] args) {

        // 1
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        add.apply(2, 2); //  he he he

        // 2
        BinaryOperator<Double> byThePowerOfGrayskull = (a, b) -> Math.pow(a, b);
        double a2 = 99.99;
        double b2 = 2.2;
        System.out.println(a2 + " to the POOWWWEEEERRR! of " + b2 + " is " + byThePowerOfGrayskull.apply(a2, b2) + ".");

        // 3
        final String[] savedForLater = new String[2];
        BiConsumer<String, String> flaverSaver = new BiConsumer<String, String>() {
            @Override
            public void accept(String mustache1, String mustache2) {
                savedForLater[0] = mustache1;
                savedForLater[1] = mustache2;
            }
        };

        flaverSaver.accept("Selleck", "Prefontaine");
        System.out.println("Great Mustaches: " + Arrays.toString(savedForLater));

        // 4
        BooleanSupplier booSupp4 = () -> true;
        System.out.println(booSupp4.getAsBoolean());

        // 5
        Consumer<Integer> consumer5 = a -> System.out.println(a + " accepted!");
        consumer5.accept(99);

        // 6
        IntToDoubleFunction intToDoubleFunction6 = a -> (double) a;
        int a6 = 99;
        System.out.println("The integer " + a6 + " is now the double " + intToDoubleFunction6.applyAsDouble(99) + ".");

        // 7
        DoubleBinaryOperator dubBiOp7 = (a, b) -> a * b;
        System.out.println(dubBiOp7.applyAsDouble(1.2, 3.4));

        // 8
        DoubleConsumer dubCons8 = a -> System.out.println("I ate " + a + ".");
        dubCons8.accept(9);

        // 9
        IntFunction yearsToRetirement = age -> 65 - age;
        System.out.println("I hope to retire in " + yearsToRetirement.apply(28) + " years or less.");

        // 10
        UnaryOperator<String> repeat = UnaryOperator.identity();
        System.out.println(repeat.apply("Echo!"));

    }

}

// 10
class Repeat10 {



}