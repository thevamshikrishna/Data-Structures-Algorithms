//11. Write a Java program to display elements and their positions in a linked list.
import java.util.LinkedList;

public class LinkedList11 {
    public void method11() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(44);

        for(int i=0;i<list.size();i++){
            System.out.println("At index "+i+" element is "+list.get(i));
        }


    }
}
