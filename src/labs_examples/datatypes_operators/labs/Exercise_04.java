package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        /*
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }
        */

        // write your code below
        int up = 42;
        int down = 3;

        String lessThan = up < down ? "up is less than down" : "up is greater than or equal to down";
        System.out.println(lessThan);


        String greaterThan = up > down ? "up is greater than down" : "up is less than or equal to down";
        System.out.println(greaterThan);


        String lessThanOrEqualTo = up <= down ? "up is less than or equal to down" : "up is greater than down";
        System.out.println(lessThanOrEqualTo);


        String greaterThanOrEqualTo = up >= down ? "up is greater than or equal to down" : "up is less down";
        System.out.println(greaterThanOrEqualTo);


        String equalTo = up == down ? "up is equal to down" : "up is not equal to down";
        System.out.println(equalTo);


        String notEqualTo = up != down ? "up is not equal to down" : "up is equal to down";
        System.out.println(notEqualTo);

    }

}

