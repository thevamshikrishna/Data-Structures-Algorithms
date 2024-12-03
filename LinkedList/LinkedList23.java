//23. Write a Java program to convert a linked list to an array list.
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList23 {
    public void method23() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Linked List is : "+list);

        ArrayList<Integer> arr = new ArrayList<>(list);
        System.out.println("ArrayList is :" + arr);
    }
}
