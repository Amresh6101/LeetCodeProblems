class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long max=0,
             tempSum=0;

        Map<Integer,Integer> map=new HashMap<>();
        int duplicate=0;

        // fixed size sliding window
        // fisrt reach at window size
        for(int i=0;i<k;i++){
            if(map.containsKey(nums[i])==true){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            
            tempSum+=nums[i];

            if(map.get(nums[i])>1){
                duplicate++;
            }
        }  
        if(duplicate==0){
            max=Math.max(tempSum,max);
        } 

        // once window size achieved always try to maintain window size
        // maintain krte hue
        // nums[j] ko add kre aur nums[i] ko delete kre
        // yaha pe nums[i] ko nums[i-k] use kr hai hai 
        // kyuki single loop me khel rhe hai

        for(int i=k;i<nums.length;i++){
            int numToBeAdd=nums[i];
            int numToBeRemove=nums[i-k];

            // logic to add the new element
            if(map.containsKey(nums[i])==true){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
               map.put(nums[i],1);
            }
          
            if(map.get(nums[i])>1){
                duplicate++;
            }

            tempSum+=nums[i];

            // logic to remove the element
            if(map.get(nums[i-k])>1){
                duplicate--;
            }
            map.put(nums[i-k],map.get(nums[i-k])-1);

            tempSum-=nums[i-k];

            if(duplicate ==0){
                max=Math.max(max,tempSum);
            }
        }       
        return max;
    }
}