import java.util.Arrays;

class frequency_Of_Element{
    public static void main(String args[]){
        int arr[]={1,4,3,8,6,4,1,3,4,8,9};

        boolean visit[]=new boolean[arr.length];

        Arrays.fill(visit,false);

        for(int i=0;i<arr.length;i++){
            if(visit[i])
            continue;
            int count=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                {
                    visit[j]=true;
                    count++;
                }
            }

            System.out.println(arr[i]+" have "+ count+" times of frequency");
        }
    }
}