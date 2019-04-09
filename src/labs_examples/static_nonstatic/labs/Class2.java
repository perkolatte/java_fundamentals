package labs_examples.static_nonstatic.labs;

public class Class2 {

    // 3) A static method calling a static method in another class
    public static void method3B() {
        System.out.println("I was printed by method3B!");
    }

    // 4) A static method calling a non-static method in another class
    public void method4B() {
        System.out.println("I was printed by method4B!");
    }

    // 6) A non-static method calling a non-static method in another class
    public void method6B() {
        System.out.println("I was printed by method6B!");
    }

    // 8) A non-static method calling a static method in another class
    public static void method8B() {
        System.out.println("I was printed by method8B!");
    }

}
