class GoodMorningThread implements Runnable {
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

class HelloThread implements Runnable  {
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

class WelcomeThread implements Runnable  {
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

public class thar {
    public static void main(String[] args) {
        GoodMorningThread goodMorning = new GoodMorningThread();
        HelloThread hello = new HelloThread();
        WelcomeThread welcome = new WelcomeThread(); 
        Thread a = new Thread(goodMorning); 
        Thread b = new Thread(hello); 
        Thread c = new Thread(welcome); 


       a.start();
       b.start();
        c.start();
    }
}


