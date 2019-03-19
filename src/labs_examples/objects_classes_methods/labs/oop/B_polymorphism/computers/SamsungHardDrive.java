package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.computers;

public class SamsungHardDrive implements HardDrive{

    @Override
    public void spinUp() {

        System.out.print("Spinning up...");

    }

    @Override
    public void spinDown() {

        System.out.print("Spinning down...");

    }
}
