  import java.lang.*; 
  interface a{ 
  abstract  void hi();
 } 
 interface b{ 
    abstract void he();
 }
 public class inter implements a,b { 
   public void hi(){ 
        System.out.println("hello world");
    }
    public void he(){ 
        System.out.println("hello jagadeesh"); 
    } 
    public static void main(String[] args) {
        inter l = new inter(); 
        l.hi(); 
        l.he();
    }
}
