//2. Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
public void method2(){
    List<String> arr=new ArrayList<>();
    arr.add("Violet");
    arr.add("Indigo");
    arr.add("Blue");
    arr.add("Green");
    arr.add("Yellow");
    arr.add("Orange");
    arr.add("Red");

    for(String x:arr) {
        System.out.println(x);
    }
}
}
