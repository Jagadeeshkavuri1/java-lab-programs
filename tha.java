class GoodMorningThread extends Thread {
    public void run() {
        for(int i=0;i<3;i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        for(int i=0;i<3;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // 3 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class tha {
    public static void main(String[] args) {
        GoodMorningThread goodMorning = new GoodMorningThread();
        HelloThread hello = new HelloThread();
        WelcomeThread welcome = new WelcomeThread();

        goodMorning.start();
        hello.start();
        welcome.start();
    }
}

