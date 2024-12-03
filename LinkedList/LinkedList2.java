//2. Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;

public class LinkedList2 {
    public void method2() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.addLast(44);
        list.add(7);

        for(int x:list) {
            System.out.println(x+" ");
        }

    }
}
