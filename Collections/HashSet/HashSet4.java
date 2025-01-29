
//4. Write a Java program to empty an hash set.
package HashSet;

import java.util.HashSet;

public class HashSet4 {
    public void method4() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("Hash Set is : "+hash);
        hash.removeAll(hash);
        System.out.println("Hash Set After Removing : "+hash);
    }
}
