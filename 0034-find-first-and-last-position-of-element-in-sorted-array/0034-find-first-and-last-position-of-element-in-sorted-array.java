class Solution {
    public int[] searchRange(int[] arr, int target) {

        int idx1=first(arr,target);
        int idx2=last(arr,target);

        return new int[]{idx1,idx2};
        
    }
    public int first(int[] arr,int target){
        int res=-1;
        int n=arr.length-1;
        int low=0;
        int high=n;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                res=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;      
    }
    public int last(int[] arr,int target){
        int res=-1;
        int n=arr.length-1;
        int low=0;
        int high=n;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;      
    }
}