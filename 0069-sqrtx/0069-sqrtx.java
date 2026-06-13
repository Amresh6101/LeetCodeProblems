class Solution {
    public int mySqrt(int x) {

        // use binary search

        int low=1;
        int high=x;
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;

            long val=(long)mid*mid;

            if(val<x){
                res=mid;
                low=mid+1;
            }
            else if(val==x){
                return mid;
            }
            else{
                high=mid-1;
            }
        }
        return res;
        
    }
}