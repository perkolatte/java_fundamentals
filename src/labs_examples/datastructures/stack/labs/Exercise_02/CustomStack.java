package labs_examples.datastructures.stack.labs.Exercise_02;

public class CustomStack<T> {

    private Object[] stackArray;
    private int topIndex = -1;

    public CustomStack() {
        this.stackArray = new Object[2];
    }

    /**
     * Adds the given item to the top of the stack (last used array index + 1)
     *
     */
    public void add(T item) {
        topIndex++;
        stackArray[topIndex] = item;
        System.out.println(this.toString());
        System.out.println("added: " + item + "\n");
        resizeArray();
    }

    /**
     * Removes most recent (top) object added to the stack
     *
     * @return Removed object
     */
    public Object pop() {
        try {
            if (topIndex == -1) {
                throw new StackEmpty_Exception("Stack empty");
            } else {
                Object popped = stackArray[topIndex];
                topIndex -= 1;
                resizeArray();
                System.out.println(this.toString());
                return popped + "\n";
            }
        } catch (StackEmpty_Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     *
     * @return Initial (bottom) object added to the stack
     */
    public Object peekFirst() {
        try {
            if (topIndex == -1) {
                throw new StackEmpty_Exception("Stack empty");
            } else {
                return stackArray[0];
            }
        } catch (StackEmpty_Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     *
     * @return Most recent (top) object added to the stack
     */
    public Object peekLast() {
        try {
            if (topIndex == -1) {
                throw new StackEmpty_Exception("Stack empty");
            } else {
                return stackArray[topIndex];
            }
        } catch (StackEmpty_Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public void resizeArray() {
        if (topIndex > -1) {
            double percentFull = (double) (topIndex + 1) / stackArray.length * 100.0;

            if (percentFull < 25.0 && (stackArray.length / 2) > topIndex + 2) {
                System.out.println("Underlying array too large. (" + (int) percentFull + "%) Resizing from " + stackArray.length + "...");
                resizeArrayDown();
            } else if (percentFull > 75) {
                System.out.println("Underlying array too small. (" + (int) percentFull + "%) Resizing from " + stackArray.length + "...");
                resizeArrayUp();
            }
        }
    }
    
    public void resizeArrayUp() {
        int newSize = (stackArray.length) * 2;
        System.out.println("...to " + newSize + "\n");

        Object[] stackArrayNew = new Object[newSize];

        for (int i = 0; i <= topIndex; i++) {
            stackArrayNew[i] = stackArray[i];
        }

        this.stackArray = stackArrayNew;
    }
    
    public void resizeArrayDown() {
        int newSize = (stackArray.length) / 2;
        System.out.println("...to " + newSize + "\n");

        Object[] stackArrayNew = new Object[newSize];

        for (int i = 0; i <= topIndex; i++) {
            stackArrayNew[i] = stackArray[i];
        }

        stackArray = stackArrayNew;
    }
    
    public int size() {
        return topIndex + 1;
    }

    @Override
    public String toString() {

        String stackString = "[  ";

        for (int i = 0; i <= topIndex; i++) {
            stackString += stackArray[i] + "  ";
        }
        stackString += "]";

        return stackString;
    }

}