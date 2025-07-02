class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap=0;
        int maxCap=0;
        for(int val: weights){
            minCap=Integer.max(val,minCap);
            maxCap+=val;
        }
        int left=minCap;
        int right=maxCap;

        while(left<right){
            int mid=left+(right-left)/2;

            if((condition(mid,weights,days))){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }

        return left;
    }
    public boolean condition(int capacity,int[] weights,int D){
        int days=1;
        int total = 0;

        for (int weight : weights) {
            total += weight;
            if (total > capacity) {
                total = weight;
                days++;
                if (days > D) {
                    return false;
                }
            }
        }
        return true;

    }
}