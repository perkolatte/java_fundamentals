package labs_examples.static_nonstatic.labs;

public class Controller {

    public static void main(String[] args) {

        Class1 class1object = new Class1();

        // 1) A static method calling another static method in the same class
        Class1.method1A();

        // 2) A static method calling a non-static method in the same class
        Class1.method2A();

        // 3) A static method calling a static method in another class
        Class1.method3A();

        // 4) A static method calling a non-static method in another class
        Class1.method4A();

        // 5) A non-static method calling a non-static method in the same class
        class1object.method5A();

        // 6) A non-static method calling a non-static method in another class
        class1object.method6A();

        // 7) A non-static method calling a static method in the same class
        class1object.method7A();

        // 8) A non-static method calling a static method in another class
        class1object.method8A();

    }

}