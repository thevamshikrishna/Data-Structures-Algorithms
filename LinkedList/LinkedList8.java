//8. Write a Java program to insert the specified element at the end of a linked list.
import java.util.LinkedList;

public class LinkedList8 {
    public void method8() {
        LinkedList<Integer> list = new LinkedList<>();

        list.offerLast(44);// It shows first because it the last element when we start inserting
        list.add(4);
        list.add(88);
        list.add(7);

        System.out.println(list);

    }
}
