class Solution {
    public int maxProfit(int[] nums) {

        int res=0;;
        int sum=0;

        for(int i=1;i<nums.length;i++){
            sum+=(nums[i]-nums[i-1]);
            res=Math.max(sum,res);
            if(sum<0){
                sum=0;
            }           
        }

        return res;
        
    }
}