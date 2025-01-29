//3. Write a Java program to get the number of elements in a hash set.
package HashSet;

import java.util.HashSet;

public class HashSet3 {
    public void method3() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("Hash Set Size is : "+hash.size());
    }
}
