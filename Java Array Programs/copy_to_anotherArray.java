import java.util.*;
class copy_to_anotherArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};

        System.out.print("Original Array is:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        int arr1[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }


        System.out.println();

        System.out.print("New Array is:");
        for(int y:arr1){
            System.out.print(y+" ");
        }


    }

}