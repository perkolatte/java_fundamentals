package labs_examples.datastructures.linkedlist.labs.Exercise_03;

public class Nodule<T> {

    T value;

    Nodule next;
    Nodule prev;

    public Nodule(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public Nodule(T value, Nodule next) {
        this.value = value;
        this.next = next;
        this.prev = null;
    }

    public Nodule(T value, Nodule next, Nodule prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
