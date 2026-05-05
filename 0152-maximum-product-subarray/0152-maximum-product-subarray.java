class Solution {
    public int maxProduct(int[] nums) {

        int pre=1;
        int res=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            pre=pre*nums[i];
            res=Math.max(res,pre);
            if(nums[i]==0){
                pre=1;
            }
        }

        int suff=1;
        int res1=Integer.MIN_VALUE;
        for(int j=nums.length-1;j>=0;j--){
            suff=suff*nums[j];
            res1=Math.max(res1,suff);
            if(nums[j]==0){
                suff=1;
            }
            
        }

        return Math.max(res,res1);
        
    }
}