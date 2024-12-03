//19. Write a Java program to remove and return the first element of a linked list.
import java.util.LinkedList;

public class LinkedList19 {
    public void method19() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("Actual List: "+list);
        System.out.println("Removing the Element :" + list.pollFirst());
        System.out.println("After Removing: "+list);
    }

    }
