class Solution {
    public int[] productExceptSelf(int[] arr) {

        int[] prefix=new int[arr.length];

        prefix[0]=1;
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        int[] suffix=new int[arr.length];
        suffix[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }

        int[] res=new int[arr.length];
        for(int k=0;k<arr.length;k++){
            res[k]=prefix[k]*suffix[k];
        }
        return res;

    }
}