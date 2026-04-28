import java.util.Arrays;

public class RotateElement {
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int l = 1, r = 5, k = 2;
        int[] arr = {1,2,3,4,5,6,6,8};
        k = k % (r - l + 1);
        reverse(arr, l, r);
        reverse(arr, l, l + k - 1);
        reverse(arr, l + k, r);
        System.out.println(Arrays.toString(arr));
    }
}