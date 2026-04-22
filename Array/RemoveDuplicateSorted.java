public class RemoveDuplicateSorted {
    public static int removeDuplicate(int[] arr){
        if(arr.length == 0) return 0;
        int k = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
   public static void main(String[] args) {
    int[] arr = {1,2,2,3,4,5,5,6};
    int res = removeDuplicate(arr);

    for(int i = 0; i < res; i++){
        System.out.print(arr[i] + " ");
    }
}
}
