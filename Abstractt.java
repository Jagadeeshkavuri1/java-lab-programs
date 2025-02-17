import java.lang.*;
  abstract class Abc{ 
    abstract void circle(int a);
     abstract void sqr(int a); 
     void tri(int a,int b){ 
        System.out.println("trinagle area is"+(0.5*a*b)); 

     }
 }
 public class Abstractt extends Abc { 
    void circle(int a){ 
        System.out.println("trinagle area is"+(3.14*a*a));     
    } 
    void sqr(int a){ 
        System.out.println("trinagle area is"+(a*a));     
    }  
    public static void main(String[] args) { 
        Abstractt k = new Abstractt(); 
        k.tri(2,5); 
        k.sqr(2); 
        k.circle(5); 
        
        
    }
    
}
