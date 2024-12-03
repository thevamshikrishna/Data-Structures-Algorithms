import java.util.ArrayList;

public class ArrayList20 {
    public void method20() {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");
        arr.ensureCapacity(10);

        System.out.println(arr.size());
    }
}
