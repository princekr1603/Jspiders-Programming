public class TwoSum{
    // public static int sum(int[] arr,int x){
    //     int i=0;
    //     int j=arr.length-1;
    //     while(i<j){
    //         int s=arr[i]+arr[j];
    //         if(s==x){
    //             return 1;
    //         }
    //         else if(s<x){
    //             i++;
    //         }
    //         else{
    //             j--;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int[] arr={1,2,4,5,6,7,9};
    //     int x=16;
    //     int result=sum(arr,x);
    //     if(result==-1){
    //         System.out.println("element not present");
    //     }
    //     else{
    //         System.out.println("element present at"+result);
    //     }
    // }
//-------------------Output in the form of array-------------------
    public static int[] sum(int[] arr, int x) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int s = arr[i] + arr[j];
            if (s == x) {
                return new int[]{i, j}; 
            } 
            else if (s < x) {
                i++;
            } 
            else {
                j--;
            }
        }
        return new int[]{-1, -1}; 
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,9};
        int x = 16;
        int[] result = sum(arr, x);
        if (result[0] == -1) {
            System.out.println("element not present");
        } else {
            System.out.println("pair found at index: " + result[0] + " , " + result[1]);
        }
    }
}
