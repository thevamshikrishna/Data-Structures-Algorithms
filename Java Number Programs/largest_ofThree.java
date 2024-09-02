
    import java.util.*;
    public class largest_ofThree {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter First Number:");
            int x=sc.nextInt();
            System.out.println("Enter Second Number:");
            int y=sc.nextInt();
            System.out.println("Enter Third Number:");
            int z=sc.nextInt();

            if(x>y && x>z)
            System.out.println(x+" Greater among all");
            else if(y>z && y>x)
            System.out.println(y+" Greater among all");
            else
            System.out.println(z+" Greater among all");
        }
    }
    