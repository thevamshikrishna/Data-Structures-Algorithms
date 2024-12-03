import java.util.ArrayList;
import java.util.List;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
public class ArrayList4 {
    public void method4() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        arr.add(0, "Hii");

        System.out.println(arr.get(0));
    }
}
