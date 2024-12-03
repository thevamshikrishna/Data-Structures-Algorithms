import java.util.ArrayList;
import java.util.List;

//3. Write a Java program to insert an element into the array list at the first position.
public class ArrayList3 {
    public void method3() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        arr.add(0, "Hii");

        System.out.println(arr);
    }
}
