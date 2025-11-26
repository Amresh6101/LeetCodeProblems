class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(String str: strs){
            int[] countZeroOnes=countFun(str);
            int zeros=countZeroOnes[0];
            int ones=countZeroOnes[1];

            for(int i=m;i>=zeros;i--){
                for(int j=n;j>=ones;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-zeros][j-ones]+1);
                }
            }
        }
        return dp[m][n];
        
    }
    public int[] countFun(String s){
        int zero=0,ones=0;
        for(char ch: s.toCharArray()){
            if(ch=='0') zero++;
            else ones++;
        }
        return new int[]{zero,ones};
    }
}