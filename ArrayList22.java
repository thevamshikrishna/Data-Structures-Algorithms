import java.util.ArrayList;

public class ArrayList22 {
    public void method22() {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Violet");
        arr.add("Indigo");
        arr.add("Blue");
        arr.add("Green");

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
