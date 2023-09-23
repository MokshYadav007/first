package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator12 {
    public static  void main(String[] args) {
        
        ArrayList ar= new ArrayList();
        ar.add(10);
        ar.add(25);
        ar.add(50);
        ar.add(67);
        ar.add(79);
        System.out.println(ar);

        Iterator it = ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println("*****************************");
         ListIterator it1 = ar.listIterator(ar.size());
        while(it1.hasPrevious()){
            System.out.println(it1.previous());

        }
    }
    
}
