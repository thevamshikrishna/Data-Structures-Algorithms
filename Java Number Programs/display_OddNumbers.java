import java.util.*;
public class display_OddNumbers {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<=100;i++){
            if(i%2!=0)
            System.out.print(i+" ");
        }
    }
}
