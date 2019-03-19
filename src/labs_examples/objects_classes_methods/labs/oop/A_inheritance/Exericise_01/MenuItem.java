package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exericise_01;

public class MenuItem {

    private String name;
    private String description;

    private double price;
    private boolean isSpicy;
    private boolean isGlutenFree;
    private boolean isVegetarian;

    public MenuItem(double price) {
        this.price = price;
    }

    protected MenuItem(String name, String description, double price, boolean isSpicy, boolean isGlutenFree, boolean isVegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isSpicy = isSpicy;
        this.isGlutenFree = isGlutenFree;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isSpicy=" + isSpicy +
                ", isGlutenFree=" + isGlutenFree +
                ", isVegetarian=" + isVegetarian +
                '}';
    }
}