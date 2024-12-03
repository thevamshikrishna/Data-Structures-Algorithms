//4. Write a Java program to iterate a linked list in reverse order.
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList4 {
    public void method4() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.addLast(44);
        list.add(7);

        Collections.reverse(list);
        System.out.println(list);

    }
}
