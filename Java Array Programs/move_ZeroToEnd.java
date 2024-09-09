public class move_ZeroToEnd {
        public static void main(String[] args) {
            int x[]={0,4,4,0,12,3};
            int index=0;
            for(int y:x){
                if(y!=0)
                x[index++]=y;
            }
            while(index<x.length){
            x[index++]=0;
            }
            
            for(int n:x){
                System.out.print(n+" ");
            }
        }
    }