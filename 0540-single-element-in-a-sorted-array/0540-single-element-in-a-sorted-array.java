class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;

        if(n==1)
        return arr[0];

        int low=0;
        int high=n-1;

        if(arr[low]!=arr[low+1]) return arr[low];
        if(arr[high]!=arr[high-1]) return arr[high];

        low=1;
        high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1])
            return arr[mid];

            //now elimination start.
            if((mid%2 ==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
        
    }
}