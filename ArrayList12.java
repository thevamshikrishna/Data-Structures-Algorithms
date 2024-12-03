import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//12. Write a Java program to extract a portion of an array list.
public class ArrayList12 {
    public void method12() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        List<String> arr1 =arr.subList(0,2);
        System.out.println(arr1);
    }
}
