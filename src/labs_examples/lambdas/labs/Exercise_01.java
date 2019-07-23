package labs_examples.lambdas.labs;

import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

class Exercise_01 {

    public static void main(String[] args) {

        // 2
        FuncInter1 funcLam2 = () -> {};
        funcLam2.doNothing();

        FuncInter1 funcAnon = new FuncInter1() {
            @Override
            public void doNothing() {}
        };
        funcAnon.doNothing();

        // 4
        FuncInter2 funcLam4 = a -> a;
        funcLam4.doNothing("nothing here");

        FuncInter2 funcAI4 = new FuncInter2() {
            @Override
            public Object doNothing(Object input) { return input; }
        };

        // 6
        FuncInter5 funcLam6 = (name, number) -> name + " is cat number " + number + ".";
        funcLam6.makeLabel("Whiskers", 9);

        FuncInter5 funcAI6 = new FuncInter5() {
            @Override
            public String makeLabel(String name, int number) {
                return name + " is cat number " + number + ".";
            }
        };

        // 7
        BiPredicate<Integer, Integer> isSameInt = (a, b) -> a == b;
        isSameInt.test(9, 9);

        Function<Integer, Integer> addOne = (a) -> a + 1;
        addOne.apply(99);

    }

}

// 1
@FunctionalInterface
interface FuncInter1 {
    public void doNothing();
}

// 3
@FunctionalInterface
interface FuncInter2<T>{
    public T doNothing(T input);
}

// 5
@FunctionalInterface
interface FuncInter5 {
    public String makeLabel(String name, int number);
}