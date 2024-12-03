//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
import java.util.LinkedList;

public class LinkedList10 {
    public void method10() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(87);

        System.out.println("First Element:"+        list.getFirst());
        System.out.println("Last Element:"+        list.getLast());

    }
}
