class Solution {
    public int pivotIndex(int[] nums) {
        // find prefix sum
        int[] arr1=new int[nums.length];
        arr1[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr1[i]=nums[i]+arr1[i-1];
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2=new int[nums.length];
        arr2[nums.length-1]=nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){
            arr2[i]=nums[i]+arr2[i+1];
        }
        System.out.println(Arrays.toString(arr2));

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                return i;
            }
        }
        return -1;
        
    }
}