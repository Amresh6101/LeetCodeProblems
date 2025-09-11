class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int val: nums1){
            set1.add(val);
        }
        ArrayList<Integer> temp=new ArrayList<>();
        for(int val: nums2){
            if(set1.contains(val)){
                temp.add(val);
            }
        }
        if(temp.size()==0) return -1;
        Collections.sort(temp);
        return temp.get(0);
    
        
    }
}