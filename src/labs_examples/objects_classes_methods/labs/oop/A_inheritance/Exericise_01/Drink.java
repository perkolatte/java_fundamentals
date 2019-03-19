package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exericise_01;

public class Drink extends MenuItem{

    private String sectionName = "NOTABLE SIPS";

    protected Drink(String name, String description, double price, boolean isSpicy, boolean isGlutenFree, boolean isVegetarian) {
        super(name, description, price, isSpicy, isGlutenFree, isVegetarian);
    }



}
