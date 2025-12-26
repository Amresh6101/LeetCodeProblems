class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // variable size sliding window hai
        // size ka pta nhi hai

        // brute approach
        // tc=O(n*n)

     

        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum>=target){
        //             windowSize=Math.min(windowSize,j-i+1);
        //             break;
        //         }
        //     }
        // }
        // if(windowSize==Integer.MAX_VALUE){
        //     return 0;
        // }
        // else{
        //     return windowSize;
        // }

        int windowSize=Integer.MAX_VALUE;
        int sum=0;

        int i=0;
        int j=0;

        while(j<nums.length){

            sum=sum+nums[j];   
            while (sum>=target){
                windowSize=Math.min(windowSize,j-i+1);
                sum=sum-nums[i];
                i++;
            }
            j++;
        }

        if(windowSize==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return windowSize;
        }
        
    }
}