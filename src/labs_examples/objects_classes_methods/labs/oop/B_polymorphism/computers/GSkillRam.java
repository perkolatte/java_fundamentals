package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.computers;

public class GSkillRam implements Ram {

    int thing;

    @Override
    public void storeThing(int number) {
        thing = number;
        System.out.println("Number " + number + " stored in memory!");
    }

    @Override
    public int retrieveThing() {
        System.out.println("Number " + thing + " retrieved from memory!");
        return thing;
    }
}
