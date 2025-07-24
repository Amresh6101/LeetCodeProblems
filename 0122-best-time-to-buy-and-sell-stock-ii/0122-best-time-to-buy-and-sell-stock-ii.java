class Solution {
    public int maxProfit(int[] arr) {
        int profit=0;

        int i=0;
        int j=1;
        while(j<arr.length){
            int val=arr[i++];
            int val1=arr[j++];

            if(val1>val){
                profit+=(val1-val);
            }
        }
        return profit;
    }
}