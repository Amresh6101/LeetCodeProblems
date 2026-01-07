class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum=0;
        int count=0;
        int j=0,i=0;
        for(j=0;j<k;j++){
            sum+=arr[j];
        }
        int avg=sum/k;
        if(avg>=threshold){
            count++;
        }

        while(j<arr.length){
            sum+=arr[j];
            sum-=arr[i];
            i++;
            int avg1=sum/k;
            if(avg1>=threshold){
               count++;
            }
            j++;
        }  
        return count;     
    }
    
}