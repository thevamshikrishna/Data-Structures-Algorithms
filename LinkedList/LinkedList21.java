//21. Write a Java program to retrieve, but not remove, the last element of a linked list.
import java.util.LinkedList;

public class LinkedList21 {
    public void method21() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Actual List: "+list);
        System.out.println("Retrieving Last Element :" + list.peekLast());
    }
}
