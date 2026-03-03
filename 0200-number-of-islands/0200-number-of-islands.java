class Solution {
    public int numIslands(char[][] grid) {
       int rows=grid.length;
       int cols=grid[0].length;
       int island=0;

       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(grid[i][j]=='1'){
                island++;
                dfs(i,j,rows,cols,grid);
            }
        }
       }
       return island;

    }
    public void dfs(int i,int j,int rows, int cols,char[][] grid){
        // base condition
        if(i<0 || i>=rows || j<0 || j>=cols || grid[i][j]=='0'){
            return ;
        }
        grid[i][j]='0';

        dfs(i+1,j,rows,cols,grid);
        dfs(i-1,j,rows,cols,grid);
        dfs(i,j+1,rows,cols,grid);
        dfs(i,j-1,rows,cols,grid);
    }
}