import java.util.Scanner;

class fibanacci_Series{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count:");
        int n=sc.nextInt();


        int n1=0,n2=1,n3;

        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}