    import java.util.*;

    public class left_Rotation {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
    
            System.out.println("Enter the length of the Array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("Enter number of rotations:");
int t=sc.nextInt();
            rotate(arr,n,t);
            sc.close();
        }

        public static void rotate(int arr[],int n,int t){
            int arr1[]=new int[arr.length];
            for(int i=t;i<n;i++){
                arr1[i]=arr[i];
            }
            for(int i=0;i<t;i++){
                arr1[i]=arr[i];
            }

            for(int x:arr1){
                System.out.print(x+" ");
            }


        }
    }