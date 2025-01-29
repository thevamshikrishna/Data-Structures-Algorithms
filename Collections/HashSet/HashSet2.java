//2. Write a Java program to iterate through all elements in a hash list.
package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public void method2() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

//        for(int x:hash) {
//            System.out.print(x+" ");
//        }

        Iterator p=hash.iterator();
        while(p.hasNext()){
            System.out.println(p.next()+" ");
        }
    }
}
