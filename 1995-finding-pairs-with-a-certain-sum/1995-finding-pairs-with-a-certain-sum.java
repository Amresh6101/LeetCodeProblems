class FindSumPairs {
    ArrayList<Integer> arr1=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();
    HashMap<Integer,Integer> map1=new HashMap<>(); 
    HashMap<Integer,Integer> map2=new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) { 
             
        for(int val: nums1){
            arr1.add(val);
            map1.put(val,map1.getOrDefault(val,0)+1);           
        }
        for(int val: nums2){
            arr2.add(val);
            map2.put(val,map2.getOrDefault(val,0)+1); 
        }      
    }
    
    public void add(int index, int val) {
        int oldVal=arr2.get(index);
        int newVal=oldVal+val;
        arr2.set(index, newVal);

        map2.put(oldVal,map2.get(oldVal)-1);
        if(map2.get(oldVal)==0){
            map2.remove(oldVal);
        } 
        map2.put(newVal,map2.getOrDefault(newVal,0)+1);

    }
    
    public int count(int tot) {
        int count = 0;
        for (int val : arr1) {
            int complement = tot - val;
            count += map2.getOrDefault(complement, 0);
        }
        return count;
        
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */