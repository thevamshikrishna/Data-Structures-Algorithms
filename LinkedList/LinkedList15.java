//15. Write a Java program that swaps two elements in a linked list.
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList15 {
    public void method15() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Before Swapping Elements :"+list);
        Collections.swap(list,0,2);
        System.out.println("After Swapping Elements :"+list);

    }
}
