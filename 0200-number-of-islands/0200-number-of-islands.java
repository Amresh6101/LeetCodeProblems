class Solution {
    public int numIslands(char[][] grid) {

        int rows=grid.length;
        int cols=grid[0].length;

        int islands=0;

        // now iterate over grid
        // if found 1 we found island and do check their corrs neighbour

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    islands++;
                    // do search for their neighbour
                    dfs(grid,i,j,rows,cols);
                }
            }
        }

        return islands;
    }
    public void dfs(char[][] grid,int i,int j,int rows,int cols){
        // base case
        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j]=='0') return;

        // now mark i,j as 0 to prevent futher visiting
        grid[i][j]='0';

        // now explore surrounding

        dfs(grid, i+1,j,rows,cols);
        dfs(grid, i-1,j,rows,cols);
        dfs(grid, i,j+1,rows,cols);
        dfs(grid, i,j-1,rows,cols);
    }
}