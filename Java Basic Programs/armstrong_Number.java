import java.util.*;

public class armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        for(int i = 0; i <= num; i++) {
            if(isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;

        temp = n;
        // Count the number of digits
        while(temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = n;
        // Calculate the sum of digits raised to the power of the number of digits
        while(temp > 0) {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return n == sum;
    }
}
