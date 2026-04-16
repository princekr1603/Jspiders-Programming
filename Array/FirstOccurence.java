public class FirstOccurence {
    public static int FirstFound(int arr[],int target){
        int low=0, high=arr.length-1,idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(target>arr[mid]){
                low=mid+1;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else if(target==arr[mid]){
                idx=mid;
                high=mid-1;
            }
        }
        return idx;
    }
        public static void main(String[] args) {
        int[] arr={1,2,2,3,7,8,11,22,34,65,78,78,78,88};
        int target=78;
        int result= FirstFound(arr,target);
        if(result==-1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("Element present at index "+result);
        }
    }
}


