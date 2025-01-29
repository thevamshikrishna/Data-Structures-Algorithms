//14. Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList14 {
    public void method14() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");

        Collections.swap(arr,0,3);

        System.out.println(arr);

    }
}
