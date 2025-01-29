//6. Write a Java program to clone a hash set to another hash set.
package HashSet;

import java.util.HashSet;

public class HashSet6 {
    public void method6() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("Hash Set is : "+hash);

        HashSet<Integer> hash1 = new HashSet<>();

        hash1=(HashSet)hash.clone();

        System.out.println("New hash1 HashSet after Cloning from hash : "+hash1);
    }
}
