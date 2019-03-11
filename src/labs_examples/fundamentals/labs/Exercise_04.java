package labs_examples.fundamentals.labs;

//import static java.lang.Math.PI;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        float r = 3.14f;
        int h = 5;

        double area = Math.PI * Math.pow(r, 2) * h;

        System.out.println(area);
    }
}
