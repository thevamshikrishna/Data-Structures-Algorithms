import java.util.ArrayList;
import java.util.List;
//5. Write a Java program to update an array element by the given element.
public class ArrayList5 {
        public void method5() {
            List<String> arr = new ArrayList<>();

            arr.add("Violet");
            arr.add("Indigo");
            arr.add("Blue");
            arr.add("Green");
            arr.set(2, "Hii");

            System.out.println(arr);
        }
    }
