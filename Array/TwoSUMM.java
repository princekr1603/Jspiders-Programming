public class TwoSUMM {
    public static int twosum(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return 1;
                //return new int[]{i,j};
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return -1;
        //return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,4,5,8};
        int target=13;
        int sum=twosum(arr, target);

        if(sum==-1){
            System.out.println("target not found");
        }
        else{
            System.out.println("target found");
        }
    }
}
