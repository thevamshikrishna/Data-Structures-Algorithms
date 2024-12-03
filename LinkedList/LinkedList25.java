//25. Write a Java program to check if a linked list is empty or not.
import java.util.LinkedList;

public class LinkedList25 {
    public void method25() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("is LinkedList Empty: " + list.isEmpty());

    }
}
