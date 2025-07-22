class Solution {
    public void rotate(int[] nums, int k) {

    //     int rotate=1;
    //     int len=nums.length;
    //     while(rotate<=k){
    //         int idx=len-1;
    //         int tempVal=nums[idx];
    //         for(int i=len-1;i>0;i--){
    //             nums[i]=nums[i-1];
    //         }
    //         nums[0]=tempVal;
    //         rotate++;
    //     }
        
    // }
    // tc- o(n)*k

    int n=nums.length;
    k=k%n;
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}