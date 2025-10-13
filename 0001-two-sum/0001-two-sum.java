class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        int[] res=new int[2];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map1.containsKey(diff)){
                res[idx++]=i;
                res[idx]=map1.get(diff);
            }
            map1.put(nums[i],i);
        }
        return res;
     
    }
}