class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hs1=new HashSet<>();

        for(int val: nums){

            if(hs1.contains(val)){
                return true;
            }
            hs1.add(val);
        }
        return false;
        
    }
}