class MyThread extends Thread { 
    public void run() { 
        System.out.println("Thread is star ng..."); 
        try { 
            Thread.sleep(2000);   
        } catch (InterruptedExcep  e) { 
            System.out.println(e); 
        } 
        System.out.println("Thread is finishing..."); 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        MyThread thread = new MyThread(); 
         
        thread.start(); 
 
        System.out.println("Is thread alive? " + thread.isAlive()); 
        try { 
            thread.join(); 
        } catch (InterruptedExcep  e) { 
           System.out.println(e); 
        } 
               System.out.println("Is thread alive a er join? " + thread.isAlive()); 
    } 
} 
