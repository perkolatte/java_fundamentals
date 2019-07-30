package labs_examples.datastructures.linkedlist.labs.Exercise_02;

public class CustomLL<T> {

    private Nodule head;

    public CustomLL(T... values) {

        if (values.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < values.length; i++) {
                add(values[i], true);
            }
        }
    }

    public void add(T value) {
        if (isEmpty()) {
            head = new Nodule(value);
        } else {
            addToFront(value);
        }
    }

    public void add(T value, boolean addToEnd) {
        if (isEmpty()) {
            head = new Nodule(value);
        } else {
            if (addToEnd) {
                addToEnd(value);
            } else {
                addToFront(value);
            }
        }
    }

    public void addToFront(T value) {
        head = new Nodule(value, head);
    }

    public void addToEnd(T value) {
        Nodule iter = head;

        while (iter.next != null) {
            iter = iter.next;
        }

        iter.next = new Nodule(value);
    }

    public void remove(T value) {

        if (head.value == value) {
            head = head.next;
        } else {
            Nodule prev = null;
            Nodule iter = head.next;

            while (iter.next != null) {
                prev = iter;
                iter = iter.next;
            }

            if (iter.value == value) {
                prev.next = null;
            }
        }
    }

    public int get(T value) {

        if (isEmpty()) {
            return -1;

        } else if (head.value == value) {
            return 0;

        } else {
            int index = 1;
            Nodule iter = head.next;

            while (iter.next != null) {
                iter = iter.next;
                index++;
            }

            if (iter.value == value) {
                return index;
            } else {
                return -1;
            }
        }
    }

    public int size() {
        int count = 0;
        Nodule iter = head;

        while (iter != null) {
            count++;
            iter = iter.next;
        }

        return count;
    }

    @Override
    public String toString() {
        Nodule iter = head;
        String output = "[ ";
        
        while (iter != null) {
            output += iter.value + " ";
            iter = iter.next;
        }
        
        return output + "]";
    }
    
    public boolean isEmpty() {
        return head == null;
    }
}
