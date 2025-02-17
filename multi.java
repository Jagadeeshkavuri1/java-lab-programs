  import java.lang.*;
  class abc{ 
    void bark(){ 
        System.out.println("barking");
    }
 } 
 class def extends abc{ 
    void eat(){ 
        System.out.println("eating");
    }
 } 
 class efg extends def{ 
    void big(){ 
        System.out.println("bigger");
    }
 }
 public class multi extends efg{ 
    public static void main(String[] args) {
        multi k = new multi(); 
        k.bark(); 
        k.eat();
        k.big();
    }
    
}
