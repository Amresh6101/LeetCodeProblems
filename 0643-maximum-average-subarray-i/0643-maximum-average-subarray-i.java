class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum=Integer.MIN_VALUE;

        int sum=0;
        int i;
        for(i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=Math.max(sum,maxSum);

        for(i=k;i<nums.length;i++){
            sum+=nums[i];
            sum=sum-nums[i-k];

            // avg=sum/k;
            // System.out.println("remaining avg:"+ avg);
            // System.out.println("remaining sum:"+ sum);
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println("max sum:"+ maxSum);
        double res=(double) maxSum/ k;
        return res;
        
    }
}