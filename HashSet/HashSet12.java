//12. Write a Java program to remove all elements from a hash set.
package HashSet;

import java.util.HashSet;

public class HashSet12 {
    public void method12() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        hash.clear();
        System.out.println("Hash Set is : "+hash);
    }
}
