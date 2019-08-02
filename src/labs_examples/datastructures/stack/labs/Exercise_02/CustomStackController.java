package labs_examples.datastructures.stack.labs.Exercise_02;

public class CustomStackController {

    public static void main(String[] args) {

        CustomStack<String> plates = new CustomStack<>();

        plates.add("plate 1");
        plates.add("plate 2");
        plates.add("plate 3");
        plates.add("plate 4");
        plates.add("plate 5");

        System.out.println("number of plates: " + plates.size());

        System.out.println("top plate: " + plates.peekLast() + "\n");
        System.out.println("bottom plate: " + plates.peekFirst() + "\n");

        System.out.println("removed: " + plates.pop());
        System.out.println("removed: " + plates.pop());
        System.out.println("removed: " + plates.pop());
        System.out.println("removed: " + plates.pop());
        System.out.println("removed: " + plates.pop());
        System.out.println("removed: " + plates.pop());

    }

}
