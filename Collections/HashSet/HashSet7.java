//7. Write a Java program to convert a hash set to an array.
package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet7 {
    public void method7() {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(5);

        System.out.println("Hash Set is : "+hash);

        ArrayList<Integer> arr=new ArrayList<>(hash);

        System.out.println("After Converting HashSet to ArrayList :"+arr);
    }
}
