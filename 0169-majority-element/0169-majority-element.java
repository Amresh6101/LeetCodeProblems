class Solution {
    public int majorityElement(int[] nums) {
        // space complexity-0(n) using hashMap

        int leader=nums[0];
        int vote=1;
        for(int i=1;i<nums.length;i++){
            if(leader==nums[i]){
                vote++;
            }else{
                if(vote==0){
                    leader=nums[i];
                    vote++;
                }
                else{
                    vote--;
                }
            }
        }
        return leader;
        
        
    }
}