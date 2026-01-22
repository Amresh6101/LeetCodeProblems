class Solution {
    public int orangesRotting(int[][] grid) {
        // this is multisource bfs pattern

        // step-1 
        // count freshOrange and put location of rotten orange into the queue

        int row=grid.length;
        int col=grid[0].length;
        int freshCount=0;

        Queue<int[]> queue=new LinkedList<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    freshCount++;
                } else if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }

        if(freshCount==0) return 0;

        int time=0;

        while(!queue.isEmpty()){
            // find queue size
            int size=queue.size();

            // do traversal level by level
            for(int i=0;i<size;i++){
                int[] rottenLoc=queue.poll();
                int r=rottenLoc[0];
                int c=rottenLoc[1];
                // find neighbour of rotten Orange location
                int[][] neighbours={
                    {r-1,c},
                    {r+1,c},
                    {r,c+1},
                    {r,c-1}
                };
                for(int[] nigh: neighbours){
                    int nr=nigh[0];
                    int nc=nigh[1];
                    // check outbound and visited condition
                    if(nr<0 || nr>=row || nc<0 || nc>=col || grid[nr][nc]==2 || grid[nr][nc]==0 ){
                        continue;
                    }
                    queue.offer(new int[]{nr, nc});
                    grid[nr][nc]=2;
                }
            }
            time++;
            freshCount=freshCount-queue.size();
            if(freshCount==0) break;
        }

        return (freshCount==0)?time:-1;
        
    }
}