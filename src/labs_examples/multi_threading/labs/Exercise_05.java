package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class WaitNotifyExample {

    public static void main(String[] args) {

        WaitNotifyRunnable machine1 = new WaitNotifyRunnable("Machine 1");
        WaitNotifyRunnable machine2 = new WaitNotifyRunnable("Machine 2");

    }

}

class WaitNotifyRunnable implements Runnable {


    Thread thread;
    static boolean onlyThread = true;
    static Object monitor = new Object();

    public WaitNotifyRunnable(String machineName) {

        thread = new Thread(this, machineName);

        thread.start();

    }

    @Override
    public void run() {

        synchronized (monitor) {
            System.out.println(thread.getName() + " booting up...");

            if (onlyThread) {
                onlyThread = false;


                try {
                    thread.sleep(1000);
                    System.out.println(thread.getName() + " waiting...");
                    thread.sleep(1000);
                    monitor.wait();
                    thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(thread.getName() + " received notification!");

            } else {

                try {
                    thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(thread.getName() + " notifying...");
                monitor.notifyAll();
            }
        }
    }
}