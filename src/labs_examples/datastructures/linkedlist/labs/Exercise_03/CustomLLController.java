package labs_examples.datastructures.linkedlist.labs.Exercise_03;

public class CustomLLController {

    public static void main(String[] args) {

        CustomLL<Integer> numbers = new CustomLL<>(0, 1, 2, 3, 4);
        System.out.println(numbers.toString());
        numbers.remove(0);
        numbers.remove(4);
        numbers.remove(5);
        System.out.println(numbers.toString());
        System.out.println("index of 4: " + numbers.get(3));
        System.out.println("size of numbers CustomLL: " + numbers.size());

    }
}
