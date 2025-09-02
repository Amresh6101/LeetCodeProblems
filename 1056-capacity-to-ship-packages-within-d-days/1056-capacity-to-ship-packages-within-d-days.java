class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        int ans=high;
       // System.out.println(high);

        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;        
    }
    public boolean isPossible(int[] weights,int capacity,int days){

        int day=1,load=0;
        for(int i=0;i<weights.length;i++){
           if(load+weights[i]>capacity){
               day++;
               load=weights[i];
           }
           else{
            load+=weights[i];
           }
        }
        return day<=days;
    }
}