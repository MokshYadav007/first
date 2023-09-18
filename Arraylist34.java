package collection;
import java.util.*;

public class Arraylist34
{
    public static void main(String[] args) {
        
        ArrayList ar= new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(560);
        System.out.println(ar);

        ArrayList ar2 = new ArrayList();
        ar2.add("string");
        ar2.add(56);
        ar2.add('t');
        ar2.add(56.6);
      System.out.println(ar2);

      ar2.add(3, "*********");
    
      System.out.println(ar2);
    }
}
