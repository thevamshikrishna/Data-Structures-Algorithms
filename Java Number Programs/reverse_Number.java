import java.util.*;
class reverse_Number{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();

int temp=n;
int rev=0;
while(temp!=0){
    int id=temp%10;
    rev=rev*10+id;
    temp=temp/10;
}
System.out.println(rev);
    }
}