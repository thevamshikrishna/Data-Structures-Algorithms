//9. Write a Java program to insert some elements at the specified position into a linked list.
import java.util.LinkedList;
public class LinkedList9 {
    public void method9() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.offerFirst(44);
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(77);
        list1.add(11);
        list.addAll(1,list1);

        System.out.println(list);

    }
}
