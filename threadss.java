 import java.lang.*;
 class a extends Thread{ 
   public void run(){ 
        for(int i=0;i<=10;i++){ 
            System.out.println("thread 1 is "+i);
        } 
    } 
    }
    class b extends Thread{ 
       public void run(){ 
            for(int i=0;i<=10;i++){ 
                System.out.println("thread 2 is "+i);
            } 
        }
    
    }
     class threadss { 
        public static void main(String[] args) {
            a k = new a(); 
            b j = new b(); 
            k.start(); 
            j.start(); 
        }
    }
