//8. Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList8 {
    public void method8() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");

        Collections.sort(arr);
        System.out.println(arr);
    }
}
