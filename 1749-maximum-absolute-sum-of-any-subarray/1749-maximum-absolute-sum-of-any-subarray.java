class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxSum=kadensMax(nums,nums.length);
        int minSum=kadensMin(nums,nums.length);

        return Math.max(maxSum,Math.abs(minSum));
        
    }
    public int kadensMax(int[] nums,int n){
        int currSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;

    }
    public int kadensMin(int[] nums,int n){
        int currSum=nums[0];
        int minSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.min(currSum+nums[i],nums[i]);
            minSum=Math.min(currSum,minSum);
        }
        return minSum;
    }
}