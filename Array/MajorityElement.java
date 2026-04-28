public class MajorityElement {
    public static int majority(int[] arr){
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i<j){
            if(arr[i]==arr[j]){
                count++;
            }
            i++;
            j--;
            return count;  
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,2,3};
        int result=majority(arr);
        System.out.println(result);
    }
}
