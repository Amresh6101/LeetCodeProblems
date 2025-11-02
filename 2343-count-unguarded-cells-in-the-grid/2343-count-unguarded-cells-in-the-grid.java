class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid=new int[m][n];
        // G==
        for(int[] arr: guards){
            grid[arr[0]][arr[1]]=1;
        }
        for(int[] brr: walls){
            grid[brr[0]][brr[1]]=2;
        }

        for(int[] guard: guards){
            int row=guard[0];
            int col=guard[1];

            // up
            for(int u=row-1;u>=0;u--){
                if(grid[u][col]==1 || grid[u][col]==2){
                    break;
                }
                grid[u][col]=3;
            }
            // down
            for(int d=row+1;d<m;d++){
                if(grid[d][col]==1 || grid[d][col]==2){
                    break;
                }
                grid[d][col]=3;
            }
            // right
            for(int r=col+1;r<n;r++){
                if(grid[row][r]==1 || grid[row][r]==2){
                    break;
                }
                grid[row][r]=3;
            }
            // left
            for(int l=col-1;l>=0;l--){
                if(grid[row][l]==1 || grid[row][l]==2){
                    break;
                }
                grid[row][l]=3;                
            }
        }
        // for(int[] crr: grid){
        //     System.out.println(Arrays.toString(crr));
        // }
        // return 3;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}