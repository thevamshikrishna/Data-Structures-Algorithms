public class print_Odd_Position {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};

        System.out.println("Elemenets at Odd positions are:");
        for(int i=0;i<arr.length;i=i+2){
            System.out.print(arr[i]+" ");
        }

    }
}
