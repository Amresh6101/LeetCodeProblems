class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        // int count=0;       
        // for(int i=0;i<nums.length;i++){
        //     int mul=1;
        //     for(int j=i;j<nums.length;j++){
        //          mul*=nums[j];
        //          if(mul<k){
        //             count++;
        //          }
        //     }
        // }
        // return count;

        int i=0;
        int j=0;
        int count=0;
        int product=1;

        if(k<=1){
            return 0;
        }
        while(j<nums.length){
            product*=nums[j];

            while(product>=k){
               product=product/nums[i];
               i++;
            }

            count+=(j-i+1);
            j++;
        }
        return count;
        
    }
}