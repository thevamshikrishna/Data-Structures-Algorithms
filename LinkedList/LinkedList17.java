//17. Write a Java program to join two linked lists.
import java.util.LinkedList;

public class LinkedList17 {
    public void method17() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Before Joining First List is :"+list);
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(55);
        list1.add(21);
        list1.add(67);
        System.out.println("Before Joining Second List is :"+list1);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addAll(list);
        list2.addAll(list1);
        System.out.println("After Combining Both LinkedLists :"+list2);


    }
}
