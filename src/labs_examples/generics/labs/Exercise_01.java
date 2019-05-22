package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class GenericController {

    public static void main(String[] args) {

        Helper<String, Integer> helper1 = new Helper<>("Thing 1", 1);
        Helper<String, Integer> helper2 = new Helper<>("Thing 2", 2);

        System.out.println(helper1.toString());
        System.out.println(helper2.toString());

    }

}

class Helper<T, V> {

    T name;
    V number;

    public Helper(T name, V number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Helper{" +
                "name=" + name +
                ", number=" + number +
                '}';
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getNumber() {
        return number;
    }

    public void setNumber(V number) {
        this.number = number;
    }
}