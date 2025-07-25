class Solution {
    public int maximumSum(int[] nums) {

        int n=nums.length;
        int deleted=0;
        int notDeleted=nums[0];
        int finalMax=nums[0];
        for(int i=1;i<n;i++){
            deleted=Math.max(notDeleted,deleted+nums[i]);
            notDeleted=Math.max(notDeleted+nums[i],nums[i]);
            int currMax=Math.max(deleted,notDeleted);
            finalMax=Math.max(finalMax,currMax);
        }
        return finalMax;
    }
}