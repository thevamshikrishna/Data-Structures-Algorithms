//5. Write a Java program to insert the specified element at the specified position in the linked list.
import java.util.LinkedList;

public class LinkedList5 {
    public void method5() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(3);
        list.add(2,44);
        list.add(7);

        System.out.println(list);

    }
}
