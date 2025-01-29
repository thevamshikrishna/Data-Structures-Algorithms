//19. Write a Java program for trimming the capacity of an array list.
import java.util.ArrayList;
import java.util.List;

public class ArrayList19 {
    public void method19() {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        arr.trimToSize();
        System.out.println(arr);
    }

    }
