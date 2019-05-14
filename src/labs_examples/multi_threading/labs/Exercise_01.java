package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class RunnableExample {

    public static void main(String[] args) {

        Runnable1 runnable1 = new Runnable1("Thread #1");

        Runnable1 runnable2 = new Runnable1();
        Thread thread2 = new Thread(runnable1, "Thread #2");
        thread2.start();

        Thread thread3 = new Thread(new Runnable1(), "Thread #3");
        thread3.start();

        new Thread(new Runnable1(), "Thread #4").start();

        thread3.setPriority(6);
        thread2.setPriority(4);
        runnable1.thread.setPriority(1);
    }

}

class Runnable1 implements Runnable {

    Thread thread;

    public Runnable1() {
    }

    public Runnable1(String name) {

        thread = new Thread(this, name);

        thread.start();

    }



    @Override
    public void run() {

        try {

            System.out.println(Thread.currentThread().getName() + " started!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}