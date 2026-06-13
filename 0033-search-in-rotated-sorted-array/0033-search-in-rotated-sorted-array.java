class Solution {
    public int search(int[] arr, int target) {


        int low=0;
        int high=arr.length-1;

        int res=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            // check which part is sorted
            if(arr[low]<=arr[mid]){
                // left part sorted
                // now check whether target present in this part or not

                if(target>=arr[low] && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }
            else{
                // right part sorted

                if(target>arr[mid] && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }

            }
        }
        return res;
        
    }
}