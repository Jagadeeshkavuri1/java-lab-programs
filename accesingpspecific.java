import java.util.Arrays;
 public class accesingpspecific { 
    public static void main(String[] args) {
        int[] b = new int[10];  
        b[0]=1; 
        b[1]=2; 
        b[2]=3; 
        b[3]=4; 
       int num=b[0]; 
       System.out.println(num); 
       b[0]=10; 
       System.out.println(b[0]); 
       System.out.println("length of array"+(b.length)); 
       int[]k=Arrays.copyOf(b,b.length); 
       for(int l=0;l<k.length;l++){ 
       System.out.println("copied"+k[l]); 
      
    }   
    boolean o = Arrays.equals(k,b); 
    System.out.println(o); 
    int aa = Arrays.binarySearch(b, 4);
    System.out.println(aa);
}

    
}
