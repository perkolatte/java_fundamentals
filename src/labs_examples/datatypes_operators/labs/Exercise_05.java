package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        /*
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        */

        // write your code below
        boolean in = true;
        boolean out = true;
        boolean up = false;
        boolean down = true;

        String and = in & out ? "3x0 animal style" : "in and/or out are/is false";
        System.out.println(and);


        String shortCircuitAnd = in | out && up & down ? "either in or out are true and up and down are true" : "in and out are false and/or up or down are false";
        System.out.println(shortCircuitAnd);


        String or = in | out ? "in or out are true" : "in and out are false";
        System.out.println(or);


        String shortCircuitOr = in & out || up | down ? "in and out are true or up or down is true" : "either in or out are false and up and down are false";
        System.out.println(shortCircuitOr);


        String exclusiveOr = in ^ out ? "either in or out are true, but not both" : "both in and out are true";
        System.out.println(exclusiveOr);


        String not = !in ? "Nobody's home! Go away!" : "Who's there?";
        System.out.println(not);
        
    }

}

