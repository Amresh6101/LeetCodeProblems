class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // similar to fruit into basket

        // one addition

        int sub1=solve(nums,k);
        int sub2=solve(nums,k-1);
        return sub1-sub2;

    }

    public int solve(int[] nums,int k){

        int i=0,j=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();

        while(j<nums.length){

            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
 
            while(map.size()>k){

                map.put(nums[i],map.get(nums[i])-1);

                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }
           
            count+=(j-i+1);
            j++;
        }
        return count;
    }
}