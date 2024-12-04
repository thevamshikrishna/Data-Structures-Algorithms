//11. Write a Java program to compare two sets and retain elements that are the same.
package HashSet;

import java.util.HashSet;

public class HashSet11 {
    public void method11() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("HashSet1 is : "+hash);

        HashSet<Integer> hash1 = new HashSet<>();
        hash1.add(5);
        hash1.add(4);
        hash1.add(9);
        hash1.add(44);
        hash1.add(27);

        System.out.println("HashSet2 is : "+hash1);

//        for(int x:hash){
//            hash1.remove(x);
//        }
        hash1.retainAll(hash);

        System.out.println(hash1);

    }
}
