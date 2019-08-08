package labs_examples.datastructures.queue.labs.Exercise_02;

public class CustomQueueController {

    public static void main(String[] args) {

        CustomQueue<String> people = new CustomQueue<>();

        people.add("person 1");
        people.add("person 2");
        people.add("person 3");
        people.add("person 4");
        people.add("person 5");
        people.add("person 6");

        System.out.println("number of people: " + people.size() + "\n");

        try {
            System.out.println("first person in line: " + people.peekFirst() + "\n");
        } catch (QueueEmpty_Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("last person in line: " + people.peekLast());
        } catch (QueueEmpty_Exception e) {
            e.printStackTrace();
        }

        for (int i = 7; i > 0; i--) {
            try {
                System.out.println(people.pop() + " removed from the beginning of the queue\n");
            } catch (QueueEmpty_Exception e) {
                e.printStackTrace(System.out);
            }
        }

    }
}
