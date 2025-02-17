 
import java.lang.*;
  class efg{ 
    int b=99;
     void abc(){  
   
         System.out.println("bigger");
     }
  }
  
 public class superr extends efg {  
    int b=100; 
    void abc(){  
     
        super.abc();
        System.out.println("eating");  
        System.out.println("first is"+super.b);
        
    }
    public static void main(String[] args) {
        superr k = new superr(); 
        k.abc();  
       
    }
    
}
