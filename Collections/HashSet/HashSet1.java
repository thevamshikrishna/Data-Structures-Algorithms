//1. Write a Java program to append the specified element to the end of a hash set.
package HashSet;

import java.util.HashSet;

public class HashSet1 {
    public void method1() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("Hash Set is : "+hash);
    }
}
