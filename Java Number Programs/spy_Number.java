import java.util.*;
public class spy_Number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to find Spy or not:");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        int temp=n;

        while(temp>0){
            int id=temp%10;
            sum+=id;
            product*=id;
            temp/=10;


        }



if(sum==product)
System.out.println(n+" is a Spy Number");
else
System.out.println("Not a Spy Number");


    }
}
