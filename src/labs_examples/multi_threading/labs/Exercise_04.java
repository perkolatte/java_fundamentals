package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class SynchronizeExample {

    public static void main(String[] args) {

        ThingDoer thingDoer = new ThingDoer();
        SyncronizedThingDoer syncronizedThingDoer1 = new SyncronizedThingDoer(1, thingDoer);
        SyncronizedThingDoer syncronizedThingDoer2 = new SyncronizedThingDoer(2, thingDoer);

        syncronizedThingDoer1.start();
        syncronizedThingDoer2.start();

        try {
            syncronizedThingDoer1.join();
            syncronizedThingDoer2.join();
        } catch(Exception e){
            System.out.println("Interrupted");
        }

        thingDoer.doThingSynchronized(3);
    }

}

class ThingDoer {

    public void doThing(int thingNumber) {

        System.out.println("Doing thing #" + thingNumber + "!");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thing interrupted.");
        }

        System.out.println("Thing #" + thingNumber + " done!");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thing interrupted.");
        }

    }

    public synchronized void doThingSynchronized(int thingNumber) {

        System.out.println("Doing thing #" + thingNumber + "!");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thing interrupted.");
        }

        System.out.println("Thing #" + thingNumber + " done!");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thing interrupted.");
        }

    }

}

class SyncronizedThingDoer extends Thread {

    private int thingNumber;
    ThingDoer thingDoer;

    SyncronizedThingDoer(int number, ThingDoer thing) {
        thingNumber = number;
        thingDoer = thing;
    }

    public void run() {

        synchronized (thingDoer) {

            thingDoer.doThing(thingNumber);

        }

    }

}