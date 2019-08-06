package labs_examples.datastructures.queue.labs.Exercise_02;

public class CustomQueue <T>{

    private Object[] queueArray = new  Object[2];
    private int frontIndex = -1;

    /**
     * Adds the given item to the rear of the queue (last used array index + 1)
     *
     */
    public void add(T item) {
        for (int i = frontIndex; i > -1; i--){
                queueArray[i + 1] = queueArray[i];
        }

        frontIndex++;
        queueArray[0] = item;

        System.out.println(this.toString());
        System.out.println(item + " added to the end of the queue\n");
        resizeArray();
    }

    /**
     * Removes initial object added to the queue (first in line)
     *
     * @return Removed object
     */
    public Object pop() {
        if (!this.isEmpty()) {
            Object popped = queueArray[frontIndex];
            frontIndex -= 1;
            resizeArray();
            System.out.println(this.toString());
            return popped;
        } else {
            return null;
        }
    }

    /**
     *
     * @return Initial object added to the queue (first in line)
     */
    public Object peekFirst() {
            if (!this.isEmpty()) {
                return queueArray[frontIndex];
            } else {
                return null;
            }
    }

    /**
     *
     * @return Most recent object added to the queue (last in line)
     */
    public Object peekLast() {
        if (!this.isEmpty()) {
            return queueArray[0];
        } else {
            return null;
        }
    }

    public void resizeArray() {
        if (queueArray.length > 1) {
            double percentFull = (double) (frontIndex + 1) / queueArray.length * 100.0;

            if (percentFull < 25.0 && (queueArray.length / 2) > frontIndex + 2) {
                System.out.println("Underlying array too large. (" + (int) percentFull + "%) Resizing from " + queueArray.length + "...");
                resizeArrayDown();
            } else if (percentFull > 75) {
                System.out.println("Underlying array too small. (" + (int) percentFull + "%) Resizing from " + queueArray.length + "...");
                resizeArrayUp();
            }
        }
    }

    public void resizeArrayUp() {
        int newSize = (queueArray.length) * 2;
        System.out.println("...to " + newSize + "\n");

        Object[] queueArrayNew = new Object[newSize];

        for (int i = 0; i <= frontIndex; i++) {
            queueArrayNew[i] = queueArray[i];
        }

        this.queueArray = queueArrayNew;
    }

    public void resizeArrayDown() {
        int newSize = (queueArray.length) / 2;
        System.out.println("...to " + newSize + "\n");

        Object[] queueArrayNew = new Object[newSize];

        for (int i = 0; i <= frontIndex; i++) {
            queueArrayNew[i] = queueArray[i];
        }

        queueArray = queueArrayNew;
    }

    public int size() {
        return frontIndex + 1;
    }

    public boolean isEmpty() {
        try {
            if (frontIndex == -1) {
                throw new StackEmpty_Exception("There is nothing in the queue");
            } else {
                return false;
            }
        } catch (StackEmpty_Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    @Override
    public String toString() {

        String stackString = "[  ";

        for (int i = 0; i <= frontIndex; i++) {
            stackString += queueArray[i] + "  ";
        }
        stackString += "]";

        return stackString;
    }


}
