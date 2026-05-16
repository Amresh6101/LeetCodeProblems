class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // isme O(n*n)
        // int res=Integer.MIN_VALUE;
        // // rotate array
        // for(int i=0;i<nums.length;i++){
        //     int sum=kadens(nums,nums.length);
        //     rotate(nums,1);
        //     res=Math.max(sum,res);
        // }
        // return res==Integer.MIN_VALUE ? 0: res;
        // find sum

        int sum=0;
        for(int val: nums){
            sum+=val;
        }
        // maxSum -- kadens 
        int maxSum=kadensMax(nums,nums.length);
        //minSum=kadens
        int minSum=kadensMin(nums,nums.length);
        // circularSum
        int cirSum=sum-minSum;

        if(maxSum<0) return maxSum;
        return Math.max(cirSum,maxSum);
        
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
    public void rotate(int[] nums,int k){

    int n=nums.length;
    int[] arr=new int[n];
    for(int i=0;i<nums.length;i++){
        arr[(i+k)%n]=nums[i];
    }

    for(int i=0;i<nums.length;i++){
        nums[i]=arr[i];
    }

    }
}