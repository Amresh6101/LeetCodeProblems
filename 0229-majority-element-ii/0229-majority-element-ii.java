class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int leader1=0;
        int vote1=0;
        int leader2=0;
        int vote2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==leader1){
                vote1++;
            }
            else if(nums[i]==leader2){
                vote2++;
            }
            else{
                if(vote1==0){
                    leader1=nums[i];
                    vote1++;
                }
                else if(vote2==0){
                    leader2=nums[i];
                    vote2++;
                }
                else{
                vote1--;
                vote2--;
                }
            }
        }
        vote1=0;
        vote2=0;
        for(int n: nums){
            if(n==leader1) vote1++;
            else if(n==leader2) vote2++;
        }
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;

        if (vote1 > threshold) result.add(leader1);
        if (vote2 > threshold) result.add(leader2);

        return result;
        
    }
}