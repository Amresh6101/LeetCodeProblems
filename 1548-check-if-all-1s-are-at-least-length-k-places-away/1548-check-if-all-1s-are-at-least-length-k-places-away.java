class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        Map<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(map1.containsKey(nums[i])){
                int val1=map1.get(nums[i]);
                int diff=i-val1-1;
                if(diff<k){
                    return false;
                }
                }
               map1.put(nums[i],i);
            }            
        }
        System.out.println(map1);
        return true;
        
    }
}