 class abc{ 
    public void hi(){  
        System.out.println("hello");
    }
 }
 public class override extends abc {
 
    public void hi(){ 
        System.out.println("world");
    } 
    public static void main(String[] args) {
        override k =new override(); 
        k.hi();
    }
}
