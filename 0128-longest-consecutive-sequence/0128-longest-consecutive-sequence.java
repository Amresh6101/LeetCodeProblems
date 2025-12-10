class Solution {
    public int longestConsecutive(int[] arr) {

        if(arr.length == 1) return 1;
        if(arr.length==0) return 0;

        Arrays.sort(arr);
        int res=1;
        int curr=1;

        for(int k=1;k<arr.length;k++){
            if(arr[k]==arr[k-1]) continue;

            if(arr[k]==arr[k-1]+1) curr++;

            else{
                res=Math.max(res,curr);
                curr=1;
            }
        }
        res=Math.max(res,curr);
        return res;
    }
}