//11. Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList11 {
    public void method11() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
