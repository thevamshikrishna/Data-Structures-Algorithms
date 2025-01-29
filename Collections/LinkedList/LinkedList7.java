//7. Write a Java program to insert the specified element at the front of a linked list.
import java.util.LinkedList;

public class LinkedList7 {
    public void method7() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.offerFirst(44);
        System.out.println(list);

    }
}
