package labs_examples.datastructures.linkedlist.labs.Exercise_02;

public class Nodule<T> {

    T value;

    Nodule next;

    public Nodule(T value) {
        this.value = value;
        this.next = null;
    }

    public Nodule(T value, Nodule nodule) {
        this.value = value;
        this.next = nodule;
    }

}
