import java.util.ArrayList;
import java.util.List;
//17. Write a Java program to empty an array list.
public class ArrayList17 {
    public void method17() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");

        arr.removeAll(arr);

        System.out.println(arr);
    }
}
