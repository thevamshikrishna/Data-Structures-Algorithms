import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList9 {
    public void method9() {
        List<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");

        List<String> arr1=new ArrayList<>();

        arr1.add("1");
        arr1.add("2");
        arr1.add("3");
        arr1.add("4");

        Collections.copy(arr,arr1);
        System.out.println(arr);
    }
}
