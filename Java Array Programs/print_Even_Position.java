public class print_Even_Position {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};

        System.out.println("Elemenets at Even positions are:");
        for(int i=1;i<arr.length;i=i+2){
            System.out.print(arr[i]+" ");
        }
    }
}
