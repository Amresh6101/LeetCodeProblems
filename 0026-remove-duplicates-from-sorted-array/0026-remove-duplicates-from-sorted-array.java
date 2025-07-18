class Solution {
    public int removeDuplicates(int[] nums) {

        // sc-o(n)
        // tc-o(n)

        // Map<Integer,Integer> map1=new LinkedHashMap<>();
        // for(int val: nums){
        //     map1.put(val,map1.getOrDefault(val,0)+1);
        // }
        // System.out.println(map1);
        // Set<Integer> set1=map1.keySet();
        // int idx=0;
        // for(int v: set1){
        //     nums[idx++]=v;
        // }

        // return idx;
        if(nums.length == 1) return 1;

        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;

        
    }
}