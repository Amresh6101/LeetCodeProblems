class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map1=new LinkedHashMap<>();
        for(int val: nums){
            map1.put(val,map1.getOrDefault(val,0)+1);
        }
        System.out.println(map1);
        Set<Integer> set1=map1.keySet();
        int idx=0;
        for(int v: set1){
            nums[idx++]=v;
        }

        return idx;
        
    }
}