class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;

        int i=0,j=0;
        int sum=0;

        while(j<nums.length){
            sum+=nums[j];
            
            while(sum>=target){
                res=Math.min(res,j-i+1);
                sum=sum-nums[i];
                i++;
            }

            j++;
        }

        if(res==Integer.MAX_VALUE) return 0;
        return res;



    }
}