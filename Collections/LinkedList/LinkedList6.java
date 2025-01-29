//6. Write a Java program to insert elements into the linked list at the first and last positions.
import java.util.LinkedList;

public class LinkedList6 {
    public void method6() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
//        list.add(0,12);
//        list.add(list.size(),44);
        list.addFirst(12);
        list.addLast(44);

        System.out.println(list);

    }
}
