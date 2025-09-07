class Solution {
    public int[] sumZero(int n) {
        
        if(n==1) return new int[]{0};
        else if(n==2) return new int[]{1,-1};
        else if(n==3) return new int[]{-1,0,1};
        else if(n%2==0){
            int[] arr=new int[n];
            int mid=n/2;
            int val1=1;
            int val2=-1;
            for(int i=mid;i<n;i++){
                arr[i]=val1++;
            }
            for(int i=mid-1;i>=0;i--){
                arr[i]=val2--;
            }
            return arr;
        }
        else{
            int[] arr=new int[n];
            int mid=n/2;
            arr[mid]=0;
            int val1=1;
            int val2=-1;
            for(int i=mid+1;i<n;i++){
                arr[i]=val1++;
            }
            for(int i=mid-1;i>=0;i--){
                arr[i]=val2--;
            }
            return arr;
        }       
    }
}