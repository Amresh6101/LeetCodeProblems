class Solution {
    public int maxFrequency(int[] nums, int k) {
        // 
        int max=0;
        Arrays.sort(nums);
        // this is brute apprch
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){

        //         sum=sum+nums[j];
        //         int totalSum=nums[j]*(j-i+1);

        //         int x=totalSum-sum;
        //         if(x<=k){
        //            max=Math.max(max,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return max;

        // converting brute to variable size sliding window

        int i=0,j=0;
        long sum=0;
        // first for loop ke place me while loop
        while(j<nums.length){
            // add to sum
            sum=sum+nums[j];

            // condition check if (x>k) break 
            // but in optimize version we have to remove element

            while(((long)nums[j]*(j-i+1) - sum) > k){
                sum=sum-nums[i];
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}