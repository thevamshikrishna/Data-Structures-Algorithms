//10. Write a Java program to compare two hash set.
package HashSet;

import java.util.HashSet;

public class HashSet10 {
    public void method10() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("First HashSet is : "+hash);

        HashSet<Integer> hash1 = new HashSet<>();
        hash1.add(1);
        hash1.add(9);
        hash1.add(3);
        hash1.add(4);
        hash1.add(5);

        System.out.println("Second Hash Set is : "+hash1);

        HashSet<String> hash2 = new HashSet<String>();

        for(int x:hash){
            System.out.println(hash1.contains(x)?"Yes":"No");
        }
    }
}
