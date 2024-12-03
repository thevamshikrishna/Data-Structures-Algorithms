//22. Write a Java program to check if a particular element exists in a linked list.
import java.util.LinkedList;

public class LinkedList22 {
    public void method22() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Checking 7 is in LinkedList or Not :" + list.contains(7));
    }
}
