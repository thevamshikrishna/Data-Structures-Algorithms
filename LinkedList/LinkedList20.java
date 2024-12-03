//20. Write a Java program to retrieve, but not remove, the first element of a linked list.
import java.util.LinkedList;

public class LinkedList20 {
    public void method20() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Actual List: "+list);
        //System.out.println("Retrieving Element :" + list.getFirst());
        System.out.println("Retrieving Element :" + list.peekFirst());
    }
}
