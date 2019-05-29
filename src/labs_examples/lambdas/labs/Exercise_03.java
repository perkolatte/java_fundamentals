package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class Exercise_03 {

    public static void main(String[] args) {

        Integer[] basicArray = {1, 2, 3};

        // 1
        Consumer<Integer[]> ex3_static = Exercise_03 :: reverseAndPrint;
        ex3_static.accept(basicArray);

        //2
        Exercise_03 ex3_instance = new Exercise_03();
        Consumer<Integer[]> consumer2 =  ex3_instance :: reverseAndPrint_instance;
        consumer2.accept(basicArray);

        //3
        Supplier<String> supplier3 = String::new;
        String myName = supplier3.get();
        myName = "Slartibartfast";
        System.out.println("My name is... " + myName + ".");

    }

    public static <T> void reverseAndPrint(T[] array) {

        T memory;

        for (int i = 0; i <= array.length / 2; i++) {

            memory = array[i];

            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = memory;
        }

        System.out.println(Arrays.toString(array));

    }

    public <T> void reverseAndPrint_instance(T[] array) {

        T memory;

        for (int i = 0; i <= array.length / 2; i++) {

            memory = array[i];

            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = memory;
        }

        System.out.println(Arrays.toString(array));

    }

}