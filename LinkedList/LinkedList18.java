//18. Write a Java program to copy a linked list to another linked list.
import java.util.LinkedList;

public class LinkedList18 {
    public void method18() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("The list is :"+list);

        LinkedList<Integer> list1 = new LinkedList<>();

        System.out.println("Before clone list1 :"+list1);
        list1=(LinkedList)list.clone();
        System.out.println("After copying list1 is :"+list1);

    }
}
