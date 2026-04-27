public class CountPlusMinus{
    public static void count(int[] arr){
        int pcount=0;
        int mcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pcount++;
            }
            else if(arr[i]<0){
                mcount++;
            }
        }
        System.out.println("pcount: "+pcount);
        System.out.println("mcount: "+mcount);
    }
    public static void sum(int[] arr){
        int psum=0;
        int msum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                psum+=arr[i];
            }
            else if(arr[i]<0){
                msum+=arr[i];
            }
        }
        System.out.println("psum: "+psum);
        System.out.println("msum: "+msum);
    }
    public static void main(String[] args) {
        int[] arr={1,-2,3,-3,0,9,-5,-10,12};
        count(arr);
        System.out.println("---------------");
        sum(arr);
    }
}