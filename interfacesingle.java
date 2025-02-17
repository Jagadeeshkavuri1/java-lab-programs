interface hi { 
 abstract void hello();
 }
 class interfacesingle implements hi  
 { 
   void hello(){ 
        System.out.println("hello world");
    }  
    public static void main(String[] args) {
        
    interfacesingle  k = new interfacesingle(); 
    k.hello();
    } 
}
