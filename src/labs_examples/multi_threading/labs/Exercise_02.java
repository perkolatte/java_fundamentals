package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class ThreadExample {


    public static void main(String[] args) {

        Thread1 thread1 = new Thread1("Thread #1");

    }

}

class Thread1 extends Thread {

    Thread1(String name) {

        super(name);
        start();

    }

    @Override
    public void run() {

        try {

            System.out.println(getName() + " started!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}