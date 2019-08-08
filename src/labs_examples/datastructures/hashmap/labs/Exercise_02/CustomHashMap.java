package labs_examples.datastructures.hashmap.labs.Exercise_02;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

/**
 * Created by Kevin Graham - https://codingnomads.co
 */
public class CustomHashMap<K, V> {

    // create the underlying Entry array with the initial size of 10
    private LogExcerpt<K, V>[] holderOfThings = new LogExcerpt[10];


    /**
     * Hashes the given key and returns a table index
     *
     * @param labelBit to be hashed
     * @return a table index
     */
    private int whereItBe(K labelBit) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int parkingSpotNumber = Math.abs(labelBit.hashCode() % holderOfThings.length);
        // the result will be the index where we can find and/or place entries
        return parkingSpotNumber;
    }

    /**
     * Adds the key-value pair to the hashmap
     *
     * @param labelBit   a key Object
     * @param theStuff a value Object
     */
    public void saveItFerLater(K labelBit, V theStuff) {
        // call the hash() method to get the index to place the element
        int parkingSpotNumber = whereItBe(labelBit);

        // create the Entry object containing the key and value that we will store in the underlying array
        LogExcerpt<K,V> captainsLogExcerpt = new LogExcerpt(labelBit, theStuff);

        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (holderOfThings[parkingSpotNumber] == null) {

            holderOfThings[parkingSpotNumber] = captainsLogExcerpt;
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        else {
            // get the first Entry (in the linked list) at the given index
            LogExcerpt<K, V> holderOfPlace = holderOfThings[parkingSpotNumber];

            // traverse the linked list
            while (holderOfPlace.afterThisOne != null) {
                holderOfPlace = holderOfPlace.afterThisOne;
            }

            // after we exit the while loop above, we'll be at the end of the linked list
            // this is where we can add the new Entry
            holderOfPlace.afterThisOne = captainsLogExcerpt;
        }

        // check for resize
        if (theStuffs().size() > holderOfThings.length * .66) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            blowItUp();
        }
    }

    /**
     * Resizes the underlying array to double its previous size and copies the old values into it
     */
    private void blowItUp() {
        // make a copy of the existing table and call it "old"
        LogExcerpt<K, V>[] ancientOne = holderOfThings;
        // create a new LogExcerpt[] that is three times the size of the old one
        holderOfThings = new LogExcerpt[ancientOne.length * 3];

        // iterate over the length of the old array
        for (int pointingFinger = 0; pointingFinger < ancientOne.length; pointingFinger++) {
            try {
                // get the LogExcerpt at the index of "i" from the "old" table
                LogExcerpt captainsLogExcerpt = ancientOne[pointingFinger];
                // call the put() method passing the key and value to add this element to the new table
                saveItFerLater((K) captainsLogExcerpt.goFetchLabelBit(), (V) captainsLogExcerpt.goFetchTheStuff());

                // check to see if this entry is actually the start of a linked list
                while (captainsLogExcerpt.afterThisOne != null) {
                    // if it is, traverse to the next node
                    captainsLogExcerpt = captainsLogExcerpt.afterThisOne;
                    // and call the put() method to add this element
                    saveItFerLater((K) captainsLogExcerpt.goFetchLabelBit(), (V) captainsLogExcerpt.goFetchTheStuff());
                    // loop
                }
            } catch (Exception eh) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }

    /**
     * Removes the pair at the given key from the hashmap
     *
     * @param labelBit of the pair to be removed
     */
    public void searchAndDestroy(K labelBit) {

        // ensure key exists by calling the get() method
        if (goFetch(labelBit) == null) {
            // if the get() method returns null, there's nothing to delete
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int parkingSpotNumber = whereItBe(labelBit);

        // get the LogExcerpt at the index
        LogExcerpt<K, V> captainsLogExcerpt = holderOfThings[parkingSpotNumber];

        // if this entry has the matching key, remove the element at this index
        if (captainsLogExcerpt.goFetchLabelBit().equals(labelBit)){
            holderOfThings[parkingSpotNumber] = null;
        } else {

            // otherwise, if the next element in the linked list is not null
            while (captainsLogExcerpt.afterThisOne != null) {
                // if the key of the next element in the linked list is not the key we're looking for
                if (captainsLogExcerpt.afterThisOne.goFetchLabelBit() != labelBit) {
                    // traverse the linked list to the next node
                    captainsLogExcerpt = captainsLogExcerpt.afterThisOne;
                }
            }

            // when we exit the loop above, entry.next will contain the key we're looking for
            // if we're deleting from the middle of a linked list we need to link
            // entry.next to entry.next.next - this is basically like turning this list:
            // a -> b -> c
            // into this list:
            // a -> c
            if (captainsLogExcerpt.afterThisOne.afterThisOne != null) {
                captainsLogExcerpt.afterThisOne = captainsLogExcerpt.afterThisOne.afterThisOne;
            }
            // otherwise, entry.next is the end of the list so we can just chop it off
            else {
                captainsLogExcerpt.afterThisOne = null;
            }
        }
    }

    /**
     * Finds the value of a key
     *
     * @param labelBit to search for
     * @return value of the given key
     */
    public V goFetch(K labelBit) {
        // call the hash() method to get the index for the key
        int parkingSpotNumber = whereItBe(labelBit);

        // nothing at key - return null
        if (holderOfThings[parkingSpotNumber] == null) {
            System.out.println("Couldn't find it, sorry.");
            return null;
        }

        // otherwise, get the LogExcerpt at the index
        LogExcerpt<K, V> captainsLogExcerpt = holderOfThings[parkingSpotNumber];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (captainsLogExcerpt.goFetchLabelBit() != labelBit) {

            // if we reach the end of the list and haven't found it return null
            if (captainsLogExcerpt.afterThisOne == null) {
                System.out.println("Really did try, but couldn't find it, sorry.");
                return null;
            }

            // otherwise, keep traversing the linked list
            captainsLogExcerpt = captainsLogExcerpt.afterThisOne;
        }

        // if we get here, that means the key has been found, return the value
        return captainsLogExcerpt.goFetchTheStuff();
    }

    /**
     * Returns all the keys in the hashmap
     *
     * @return a CustomLinkedList of values
     */
    public CustomLinkedList<V> theStuffs() {
        CustomLinkedList<V> theStuffs = new CustomLinkedList<>();

        // iterate through all indexes of the table
        for (int pointingFinger = 0; pointingFinger < holderOfThings.length; pointingFinger++) {
            // if the element at the index of "i" is not null
            if (holderOfThings[pointingFinger] != null) {

                // get the element at the index of "i"
                LogExcerpt<K, V> holderOfPlace = holderOfThings[pointingFinger];

                // check to see if this is the beginning of a linked list
                while (holderOfPlace != null) {
                    // if it is, traverse the list and add all keys
                    theStuffs.add(holderOfPlace.goFetchTheStuff());
                    holderOfPlace = holderOfPlace.afterThisOne;
                }

            }
        }

        return theStuffs;
    }

    public void clear() {
        holderOfThings = new LogExcerpt[10];
    }


    /**
     * For Testing: gets the size of the underlying array
     *
     * @return int storage size
     */
    public int canSheTakeAnyMoreScotty() {
        return holderOfThings.length;
    }

}
