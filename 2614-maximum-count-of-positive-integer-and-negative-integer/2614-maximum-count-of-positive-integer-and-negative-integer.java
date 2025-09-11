class Solution {
    public int maximumCount(int[] nums) {

        int posCount=0;
        int negCount=0;
        for(int val:nums){
            if(val<0){
                negCount++;
            }
            else if(val>0){
                posCount++;
            }
            else{
                continue;
            }
        }

        return Math.max(posCount,negCount);
        
    }
}