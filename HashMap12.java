package collection;
import java.util.*;

public class HashMap12 {
    public static void main(String[] args) {

          HashMap hm = new HashMap();  
          hm.put(01, "this");
          hm.put(02, "is");
          hm.put(03, "hashmap");

          System.out.println(hm);

          HashMap hm1 = new HashMap();
          hm1.put("yes", "this");
          hm1.put("new", "is");
          hm1.put("hashtable", "hashmap");

          System.out.println(hm1);

          LinkedHashMap hm2 = new LinkedHashMap();
          hm2.put("yes", "this");
          hm2.put("new", "is");
          hm2.put("hashtable", "hashmap");

          System.out.println(hm2);
    }
}
