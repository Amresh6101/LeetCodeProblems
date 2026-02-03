class Solution {
    public int numEnclaves(int[][] grid) {


        // same question to the surrounded regions
        // corner and connected 1 ko 2 mark ko

        //now jo bacha hua 1 hai usko count kr lo
        // wahi answer hoga

        int rows=grid.length;
        int cols=grid[0].length;

        // first column and last column

        for(int i=0;i<rows;i++){
            if(grid[i][0]==1) dfs(grid,i,0);
            if(grid[i][cols-1]==1) dfs(grid,i,cols-1);
        }

        // first row and last rows

        for(int j=0;j<cols;j++){
            if(grid[0][j]==1) dfs(grid,0,j);
            if(grid[rows-1][j]==1) dfs(grid,rows-1,j);
        }
        
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) count++;
            }
        }

        return count;
    }
    public void dfs(int[][] grid,int r,int c){
        // base condition
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=1) return;


        grid[r][c]=2;

        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}