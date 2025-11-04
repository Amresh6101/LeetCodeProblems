class Solution {
    int n;
    int[][] dp;
    public int paintWalls(int[] cost, int[] time) {
        n=cost.length;
        dp=new int[501][501];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return solve(0,n,cost,time);
    }
    public int solve(int idx,int wall,int[] cost, int[] time){
        // base case
        if(wall<=0){
            return 0;
        }
        if(idx>=n){
            return (int) 1e9;
        }
        if(dp[idx][wall]!=-1){
            return dp[idx][wall];
        }

        int paint=cost[idx]+solve(idx+1,wall-1-time[idx],cost,time);
        int not_paint=solve(idx+1,wall,cost,time);

        return dp[idx][wall]=Math.min(paint,not_paint);
    }
}