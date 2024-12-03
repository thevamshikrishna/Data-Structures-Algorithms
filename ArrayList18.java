import java.util.ArrayList;
import java.util.List;
//18. Write a Java program to test whether an array list is empty or not.
public class ArrayList18 {
    public void method18() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");


        System.out.println(arr.isEmpty());

        arr.removeAll(arr);

        System.out.println(arr.isEmpty());
    }
}
