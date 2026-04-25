class Solution {
    public int totalFruit(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        int len=0,maxLen=0;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.size()>=3){
                int val1=map.get(nums[i]);
                val1--;
                map.put(nums[i],val1);

                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }

            len=j-i+1;
            maxLen=Math.max(maxLen,len);
        }
        return maxLen;
        
    }
}