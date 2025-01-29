//12. Write a Java program to remove a specified element from a linked list.
import java.util.LinkedList;

public class LinkedList12 {
    public void method12() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.offerFirst(44);
        System.out.println(list);
        list.remove(3);
        System.out.println("List after removing "+list);

    }
}
