//13. Write a Java program to remove the first and last elements from a linked list.
import java.util.LinkedList;

public class LinkedList13 {
    public void method13() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Before Removing first and last Element:"+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("List after removing "+list);

    }
}
