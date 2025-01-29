//14. Write a Java program to remove all elements from a linked list.
import java.util.LinkedList;

public class LinkedList14 {
    public void method14() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Before Removing Elements:"+list);
        list.removeAll(list);
        System.out.println("List after removing "+list);

    }
}
