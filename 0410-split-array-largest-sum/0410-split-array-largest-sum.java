class Solution {
    public int splitArray(int[] nums, int k) {

        int n=nums.length;
        int low=0;
        int high=0;
        for(int val: nums){

            low=Math.max(low,val);
            high+=val;
        }

        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,nums,k)){
                 ans=mid;
                 high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;      
    }

    public boolean isPossible(int mid,int[] nums,int k){

        int currSum=0;
        int count=1;

        for(int val: nums){
            currSum+=val;
            if(currSum>mid){
                count++;
                currSum=val;
                if(count>k) return false;
            }
        }

        return true;

    }
}