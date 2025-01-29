import java.util.ArrayList;
import java.util.List;

//16. Write a Java program to clone an array list to another array list.
public class ArrayList16 {
    public void method16() {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");

        ArrayList<String> arr1 = (ArrayList<String>) arr.clone();

        System.out.println(arr1);
    }
}
