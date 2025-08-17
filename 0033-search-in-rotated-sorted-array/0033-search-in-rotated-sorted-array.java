class Solution {
    public int search(int[] arr, int target) {
        // we have to find which part of the array is sorted it is either left and right.

        int n=arr.length;
        int low=0;
        int high=n-1;


        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;

            // if arr[mid] not equal to target we have to find which part is sorted and not sorted.

            else if(arr[mid]<=arr[high]){
                 // check is target is present in their search space.
                 if(arr[mid]<target && target<=arr[high]){
                    low=mid+1;
                 }
                 else{
                    high=mid-1;
                 }
            }
            else{
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;

    }
}