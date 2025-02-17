/**
 * creatingandaccessingarray
 */
public class creatingandaccessingarray {

    public static void main(String[] args) {
        int [] a={1,5,6,4,8};
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        } 
        int[] b = new int[5];  
        b[0]=1; 
        b[1]=2; 
        b[2]=3; 
        b[3]=4; 
        for (int j=0;j<b.length;j++){ 
            System.out.println(b[j]);
        }


    }
}