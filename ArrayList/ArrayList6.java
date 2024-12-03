//6. Write a Java program to remove the third element from an array list.
import java.util.ArrayList;
import java.util.List;

//3. Write a Java program to insert an element into the array list at the first position.
public class ArrayList6 {
    public void method6() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        arr.remove(2);

        System.out.println(arr);
    }
}
