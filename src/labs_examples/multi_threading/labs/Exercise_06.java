package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Alternater {

    public static void main(String[] args) {

        AlternatingCounter odd = new AlternatingCounter("Odd");
        AlternatingCounter even = new AlternatingCounter("Even");

    }

}

class AlternatingCounter implements Runnable {

    Thread thread;
    static int count = 1;
    static final Object monitor = new Object();

    public AlternatingCounter(String name) {

        thread = new Thread(this, name);

        thread.start();

    }

    @Override
    public void run() {

        synchronized (monitor) {

            if (count < 2) {
                while (count <= 99) {

                    try {

                        thread.sleep(250);
                        monitor.notifyAll();
                        System.out.println(thread.getName() + ": " + count);
                        count++;
                        monitor.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            } else {
                while (count <= 100) {

                    try {

                        thread.sleep(250);
                        monitor.notifyAll();
                        System.out.println(thread.getName() + ": " + count);
                        count++;
                        monitor.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }
    }
}