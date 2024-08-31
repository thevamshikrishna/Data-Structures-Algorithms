import java.util.Scanner;

class prime_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number:");
        int n=sc.nextInt();

        boolean prime=true;

        if(n<=1)
        prime=false;
        else{
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
    }
    if(prime)
    System.out.println("Its a Prime Number");
    else
    System.out.println("Not Prime");
    }
}