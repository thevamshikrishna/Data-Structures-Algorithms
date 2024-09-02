import java.util.*;
public class SumOf_Natural_Numbers {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to find Sum:");
    int n=sc.nextInt();

  int sum=0;
    for(int i=0;i<=n;i++){
        sum+=i;
    }
    System.out.println("Sum is:"+sum);
    }
}
