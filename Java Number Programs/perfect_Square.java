import java.util.*;
public class perfect_Square {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
       double x=Math.sqrt(n);
       if(x-Math.floor(x)==0)
        System.out.println("Perfect Square");
    
        else 
        System.out.println("Not Perfect Square");
    }
}
