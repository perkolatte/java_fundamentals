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

        System.out.println("last person in line: " + people.peekLast());
        System.out.println("first person in line: " + people.peekFirst() + "\n");

        System.out.println(people.pop() + " removed from the beginning of the queue\n");
        System.out.println(people.pop() + " removed from the beginning of the queue\n");
        System.out.println(people.pop() + " removed from the beginning of the queue\n");
        System.out.println(people.pop() + " removed from the beginning of the queue\n");
        System.out.println(people.pop() + " removed from the beginning of the queue\n");
        System.out.println(people.pop() + " removed from the beginning of the queue\n");
        System.out.println(people.pop() + " removed from the beginning of the queue\n");

    }

}
