//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
    public void method3() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.addLast(44);
        list.add(7);

        Iterator p=list.listIterator(2);

        while(p.hasNext()){
            System.out.println(p.next());
        }

    }
}
