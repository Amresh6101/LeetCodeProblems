class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum=0;
        long maxSum=0;
        int n=nums.length;
        int i=0;
        HashSet<Integer> set=new HashSet<>();

        for(int j=0;j<nums.length;j++){

            // first check whether nums[j] is present in set or not.
            // if present ,shrink the window untill duplicate remove

            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }

            sum+=nums[j];
            set.add(nums[j]);

            if(j-i+1 == k){
               maxSum=Math.max(maxSum,sum);
               sum-=nums[i];
               set.remove(nums[i]);
               i++; 
            }
        }
        return maxSum;
    }
}