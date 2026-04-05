class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int[] maxR=new int[n];
        int[] maxL=new int[n];
        int[] water=new int[n];
        // water[i]=min(maxR,maxL)-arr[i]

        maxR[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            maxR[i]=Math.max(maxR[i+1],arr[i]);
        }
        maxL[0]=arr[0];
        for(int i=1;i<n;i++){
            maxL[i]=Math.max(maxL[i-1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            water[i]=Math.min(maxL[i],maxR[i])-arr[i];
            sum+=water[i];
        }
        return sum;
        
    }
}