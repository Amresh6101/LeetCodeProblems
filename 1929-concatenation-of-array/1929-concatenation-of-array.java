class Solution {
    public int[] getConcatenation(int[] nums) {

        int len=nums.length;
        int[] arr=new int[2*len];

        int i=0,j=0;
        int idx=0;
        while(i<len){
            arr[idx++]=nums[i++];
        }
        while(j<len){
            arr[idx++]=nums[j++];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
        
    }
}