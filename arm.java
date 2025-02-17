 import java.util.*;
 import java.lang.*;
 public class arm { 
    public static void main(String[] args) {
        int temp,di=0,k; 
        double j=0; 
        Scanner sc = new Scanner(System.in); 
        int number =sc.nextInt();
        int temp1= number; 
        temp=number;
          while(temp!=0){ 
            temp=temp/10; 
            di+=1;
          }   
          temp=number;

          while(number!=0){ 
            k= number%10; 
            j=j+Math.pow(k,di); 
            number=number/10;
          } 
          if(j==temp1){ 
            System.out.println("super match");
          } 
          else{ 
            System.out.println("not match");
          } 
          sc.close();
    }
    
}
