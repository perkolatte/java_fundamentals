package labs_examples.static_nonstatic.labs;

public class Class1 {

    // 1) A static method calling another static method in the same class
    public static void method1A() {
        method1B();
    }
    public static void method1B() {
        System.out.println("I was printed by method1B!");
    }

    // 2) A static method calling a non-static method in the same class
    public static void method2A() {
        Class1 class1object = new Class1();
        class1object.method2B();
    }
    public void method2B() {
        System.out.println("I was printed by method2B!");
    }

    // 3) A static method calling a static method in another class
    public static void method3A() {
        Class2.method3B();
    }

    // 4) A static method calling a non-static method in another class
    public static void method4A() {
        Class2 class2object = new Class2();
        class2object.method4B();
    }

    // 5) A non-static method calling a non-static method in the same class
    public void method5A() {
        method5B();
    }
    public void method5B() {
        System.out.println("I was printed by method5B!");
    }

    // 6) A non-static method calling a non-static method in another class
    public void method6A() {
        Class2 class2object = new Class2();
        class2object.method6B();
    }

    // 7) A non-static method calling a static method in the same class
    public void method7A() {
        method7B();
    }
    public static void method7B() {
        System.out.println("I was printed by method7B!");
    }

    // 8) A non-static method calling a static method in another class
    public void method8A() {
        Class2.method8B();
    }

}


