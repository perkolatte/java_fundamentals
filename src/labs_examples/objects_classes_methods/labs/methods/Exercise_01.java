package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(9, 4));
        System.out.println(divide(4,7));
        joke("How'd you like to run the vacuum all by yourself?");
        System.out.println(convertToSeconds(85));
        System.out.println(countInputs(1, 2, 3, 4, 5));
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static double divide(int a, int b) {
        return (double) a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    static void joke (String prompt) {
        if (prompt.equals("How'd you like to run the vacuum all by yourself?")) {
            System.out.println("Oh, boy.");
        } else {
            System.out.println("Come again?");
        }
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static long convertToSeconds(int years) {
        return (long) years * 31557600;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int countInputs(int...numbers) {
        return numbers.length;
    }





}
