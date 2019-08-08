package labs_examples.datastructures.hashmap.labs.Exercise_02;

/**
 * A Key-Value Pair
 */
public class LogExcerpt<K, V> {
    private K labelBit;
    private V theStuff;
    // it means this is a LinkedList
    LogExcerpt afterThisOne = null;

    LogExcerpt(K labelBit, V theStuff) {
        this.labelBit = labelBit;
        this.theStuff = theStuff;
    }

    public K goFetchLabelBit() {
        return labelBit;
    }

    public V goFetchTheStuff() {
        return theStuff;
    }

    public void relabel(V theStuff) {
        this.theStuff = theStuff;
    }
}
