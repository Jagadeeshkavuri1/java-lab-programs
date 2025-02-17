class MyThread extends Thread {
    public void run() {
        // Print thread name and start the execution
        System.out.println(Thread.currentThread().getName() + " is starting.");
        try {
            // Simulate some work by making the thread sleep for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}

public class xyx {
    public static void main(String[] args) {
        // Creating two threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Starting both threads
        thread1.start();
        thread2.start();

        // Check if the threads are alive after starting
        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());

        try {
            // Calling join on both threads so main thread waits for their completion
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Check if threads are alive after join (they should be finished)
        System.out.println("Thread 1 is alive after join: " + thread1.isAlive());
        System.out.println("Thread 2 is alive after join: " + thread2.isAlive());

        System.out.println("Main thread has finished execution.");
    }
}

