class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map1=new HashMap<>();
        for(int val:nums){
            map1.put(val,map1.getOrDefault(val,0)+1);
        }
  
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map1.entrySet());

        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] res=new int[k];
        int i=0;
        int idx=0;

        while(i<k){
            Map.Entry<Integer,Integer> et1=list.get(i);
            res[idx++]=et1.getKey();
            i++;
        }
        return res;
    }

}