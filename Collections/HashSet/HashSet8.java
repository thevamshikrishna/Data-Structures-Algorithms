//8. Write a Java program to convert a hash set to a tree set.
package HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet8 {
    public void method8() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("Hash Set is : "+hash);

        TreeSet<Integer> tree=new TreeSet<>(hash);

        System.out.println("After Converting HashSet to TreeSet :"+tree);
    }
}
