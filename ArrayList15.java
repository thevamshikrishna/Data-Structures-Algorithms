//15. Write a Java program to join two array lists.
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayList15 {
    public void method15() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");

        List<String> arr1 = new ArrayList<>();

        arr1.add("Red");
        arr1.add("White");
        arr1.add("Grey");
        arr1.add("Orange");

        List<Object> a=new ArrayList<>();
        a.addAll(arr);
        a.addAll(arr1);
        System.out.println(a);

    }
}
