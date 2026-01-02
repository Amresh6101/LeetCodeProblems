class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        

        // we have 
        // int i=0;
        // int j=0;
        // this is brute approach

        // for(int i=0;i<nums.length;i++){
        //     Set<Integer> set=new HashSet<>();
        //     for(int j=i;j<=Math.min(i+k,nums.length-1);j++){
        //         if(set.contains(nums[j])) return true;
        //         set.add(nums[j]);
        //     }
        // }

        // return false;

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<Math.min(k,nums.length);i++){
            if(set.contains(nums[i])) return true;

            set.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(set.contains(nums[i])) return true;

            set.add(nums[i]);
            set.remove(nums[i-k]);
        }
        return false;
    }
}