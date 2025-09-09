class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int[] ans=new int[]{0,0};
        for(int i=0;i<mat.length;i++){
            int oneCount=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    oneCount++;
                }
            }
            if(oneCount>ans[1]){
                ans[0]=i;
                ans[1]=oneCount;
            }
            else if(oneCount==ans[1]){
                ans[0]=Math.min(ans[0],i);
                ans[1]=oneCount;
            }
            else{
                continue;
            }

        }
        return ans;       
    }
}