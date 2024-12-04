//9. Write a Java program to find numbers less than 7 in a tree set.
package HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet9 {
    public void method9() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("Hash Set is : "+hash);

        TreeSet<Integer> tree=new TreeSet<>(hash);

        System.out.println("After Converting HashSet to TreeSet :"+tree);

            System.out.println("Element less than 7 in tree is: "+tree.floor(7));

    }
}
