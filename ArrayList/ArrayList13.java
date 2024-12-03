//13. Write a Java program to compare two array lists.
import java.util.*;

public class ArrayList13 {
    public void method13()

    {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        List<String> arr1 =new ArrayList<>();

        arr1.add("White");
        arr1.add("Indigo");
        arr1.add("Blue");
        arr1.add("Grey");

        ArrayList<String> c3 = new ArrayList<String>();
        for(String x:arr)
            c3.add(arr1.contains(x)?"Yes":"No");
        System.out.println(c3);
    }
}
