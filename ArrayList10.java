//10. Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList10 {
    public void method10() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        Collections.shuffle(arr);
        System.out.println(arr);
    }
}