//5. Write a Java program to test if a hash set is empty or not.
package HashSet;

import java.util.HashSet;

public class HashSet5 {
    public void method5() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("Hash Set is : "+hash);
        System.out.println("Is HashSet is Empty : "+hash.isEmpty());
        hash.removeAll(hash);
        System.out.println("After removing HashSet is : "+hash);
        System.out.println("Is HashSet is Empty : "+hash.isEmpty());
    }
}
