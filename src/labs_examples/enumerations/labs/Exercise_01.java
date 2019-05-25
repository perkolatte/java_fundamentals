package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

class enumController {

    public static void main(String[] args) {

        EnumTest.Drink myDrink = EnumTest.Drink.MARTINI;
        System.out.printf("You'll need a %s for your %s.%n", myDrink.getGlassType(), myDrink.toString().toLowerCase());

    }

}

class EnumTest {

    public enum Drink {

        MARTINI("cocktail glass"),
        BEER("pint glass"),
        WHISKEY("snifter");

        private final String glassType;

        Drink(String glassType) {
            this.glassType = glassType;
        }

        public String getGlassType() {
            return glassType;
        }

    }

}