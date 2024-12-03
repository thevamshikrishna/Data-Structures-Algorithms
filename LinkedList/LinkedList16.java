//16. Write a Java program to shuffle elements in a linked list.
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList16 {
    public void method16() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Before Shuffle Elements :"+list);
        Collections.shuffle(list);
        System.out.println("After Shuffle :"+list);

    }
}
