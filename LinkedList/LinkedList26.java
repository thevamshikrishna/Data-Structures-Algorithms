//26. Write a Java program to replace an element in a linked list.
import java.util.LinkedList;

public class LinkedList26 {
    public void method26() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        list.set(0,44);
        System.out.println("LinkeddList : " + list);
    }
}
