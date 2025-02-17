public class cover1 { 
    cover1(){ 
        System.out.println("default constructor");
    } 
    cover1(int a,int b){ 
        System.out.println("adding "+(a+b));
    } 
    public static void main(String[] args) {
        cover1 k =new cover1(); 
        cover1 k1 =new cover1(22,3);
    }
    
}
