import java.util.*;
public class number_to_Word {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        String x=Integer.toString(n);
    System.out.println(x+" is Converted to "+((Object)x).getClass().getSimpleName());

        
    }
}
