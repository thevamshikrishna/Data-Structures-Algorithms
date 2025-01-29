//24. Write a Java program to compare two linked lists.
import java.util.LinkedList;

public class LinkedList24 {
    public void method24() {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(88);
        list.add(7);
        list.add(78);
        System.out.println("List 1" + list);

        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(44);
        list2.add(18);
        list2.add(4);
        list2.add(7);
        System.out.println("List 2" + list2);


        LinkedList<Object> list3 = new LinkedList<>();
        for(int x:list){
            list3.add(list2.contains(x)?"Yes":"No");
        }


        System.out.println(list3);
    }
}
