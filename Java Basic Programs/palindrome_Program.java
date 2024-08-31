import java.util.*;

public class palindrome_Program {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number or String to find Polindrome or Not:");
        String n=sc.nextLine();
        String x="";

        for(int i=n.length()-1;i>=0;i--){
            x+=n.charAt(i);
        }

        if(x.equals(n))
        System.out.println("It's a Polindrome");
        else
        System.out.println("Not Polindrome");

    }
}
