package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.computers;

public class SonyKeyboard extends Keyboard{

    @Override
    public boolean press() {
        return false;
    }

    @Override
    public boolean release() {
        return true;
    }
}
