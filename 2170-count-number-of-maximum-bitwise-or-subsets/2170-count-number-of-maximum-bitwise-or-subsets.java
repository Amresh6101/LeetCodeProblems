class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOrvalue=0;
        for(int val: nums){
            maxOrvalue |= val;
        }
        return countSubsets(nums,0,0,maxOrvalue);     
    }

    public int countSubsets(int[] nums,int index,int currentOr,int targetOr){

        if(index==nums.length){
            return currentOr==targetOr?1:0;
        }
        int countWithout=countSubsets(nums,index+1,currentOr,targetOr);
        int countWith=countSubsets(nums,index+1,currentOr|nums[index],targetOr);

        return countWithout+countWith;

    }
}