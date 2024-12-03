//1. Write a Java program to append the specified element to the end of a linked list.
import java.util.LinkedList;
public class LinkedList1 {
    public void method1() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.addLast(44);
        list.add(7);

        System.out.println(list);

    }
}
