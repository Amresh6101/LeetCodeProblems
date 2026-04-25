class Solution {
    public int longestOnes(int[] nums, int k) {

        int i=0,j=0,len=0,maxLen=0,countZero=0;

        int n=nums.length;

        while(j<n){
            if(nums[j]==0){
                countZero++;
            }
            while(countZero>k){
                if(nums[i]==0) countZero--;
                i++;
            }
            len=j-i+1;
            maxLen=Math.max(len,maxLen);
            j++;
        }
        return maxLen;
        
    }
}