class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n=bloomDay.length;
        long totalFlower_Req=(long)m*k;
        if(n<totalFlower_Req) return -1;

        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;       
    }

    public boolean isPossible(int[] bloomDay,int midDay,int m,int k){
        int count=0;
        int no_of_beq=0;
        for(int val: bloomDay){
            if(val<=midDay){
                count++;
            }
            else{
                no_of_beq+=(count/k);
                count=0;
            }
        }
        no_of_beq+=(count/k);
        return no_of_beq>=m;

    }
}