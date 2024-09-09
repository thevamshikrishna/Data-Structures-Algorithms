import java.util.*;
class duplicate_Elements{
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,5,5,5,6,7};
        Set<Integer> s=new HashSet<>();

        for(int num:arr){
            s.add(num);
        }

        System.out.print(s);

    }
}