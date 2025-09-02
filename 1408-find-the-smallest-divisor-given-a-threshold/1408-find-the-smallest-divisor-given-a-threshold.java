class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(nums,threshold,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public boolean isPossible(int[] nums,int threshold,int mid){
       
            int sum=0;
            for(int i=0;i<nums.length;i++){
                int ceilValue=(int)Math.ceil((double)nums[i]/mid);
                sum+=ceilValue;
            }
            if(sum<=threshold){
                return true;
            }
            return false;
    
    }
}