// Custom thread class that extends Thread
class SimpleThread extends Thread {
    private String name;

    SimpleThread(String name) {
        this.name = name; // Assign the thread name
    }

    // Override the run method to define what the thread will do
    public void run() {
        System.out.println(name + " is starting.");
        try {
            // Simulate doing some work
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
        System.out.println(name + " is finishing.");
    }
}

// Main class to execute the program
public class thr {
    public static void main(String[] args) {
        // Create two thread objects
        SimpleThread thread1 = new SimpleThread("Thread A");
        SimpleThread thread2 = new SimpleThread("Thread B");

        // Start the threads
        thread1.start();
        thread2.start();

        // Check if threads are alive
        System.out.println("Is " + thread1.getName() + " alive? " + thread1.isAlive());
        System.out.println("Is " + thread2.getName() + " alive? " + thread2.isAlive());

        try {
            // Wait for threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Final check after threads have finished
        System.out.println("Is " + thread1.getName() + " alive after join? " + thread1.isAlive());
        System.out.println("Is " + thread2.getName() + " alive after join? " + thread2.isAlive());

        System.out.println("Main thread: Both threads have finished.");
    }
}
