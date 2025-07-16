class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list=new ArrayList<>();

        for(int val: nums){
            int idx=Collections.binarySearch(list,val);
            // if key found -- return index of key
            // if not -- return -(low+1);
            if(idx<0){
                // to get index where element can be inserted.
                idx= -(idx+1);
            }
            if(list.size()==idx){
                list.add(val);
            }
            else{
                list.set(idx,val);
            }
        }
        return list.size();
        
    }
}