//7. Write a Java program to search for an element in an array list.

import java.util.ArrayList;
import java.util.List;

public class ArrayList7 {
    public void method7() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");

        System.out.println(arr.contains("Blue"));
    }
}
