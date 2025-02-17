import java.io.*; 
import java.lang.*;

public class Abc12 {
    public static void main(String[] args) {
        try {
            FileReader obj1 = new FileReader("xyz.txt");
            FileWriter obj2 = new FileWriter("xyz1.txt");
            int i;
            while ((i = obj1.read()) != -1) {
                obj2.write((char) i);
            }
            System.out.println("Copying done");
            obj1.close();
            obj2.close();
        } catch (Exception e) {
            System.out.println("There is an error. Please check");
        }
    }
}

