import java.util.Arrays;

public class MovesZero {
    public static void shiftzero(int[] arr){
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,0,0,2,0,4,12,0};
        shiftzero(nums);
        System.out.println(Arrays.toString(nums));
    }
}
