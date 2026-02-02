class Solution {
    public int[][] updateMatrix(int[][] mat) {

        // saare zero wale postion ko queue me daale;
        // and 1 ko koi place holder se replace kre.
        int rows=mat.length;
        int cols=mat[0].length;
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }
                else{
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        // directions
        int[][] directions={
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        while(!q.isEmpty()){
            int[] cell=q.poll();
            int r=cell[0];
            int c=cell[1];

            for(int [] dir: directions){
                // [1,0] [-1,0] [0,1] [0,-1]

                int nRow=r+dir[0];
                int nCol=c+dir[1];

                // base condition
                if(nRow>=0 && nRow<rows && nCol>=0 && nCol<cols){
                    if(mat[nRow][nCol]>mat[r][c]+1){
                        mat[nRow][nCol]=mat[r][c]+1;
                        q.offer(new int[]{nRow,nCol});
                    }
                }
            }
        }

        return mat;
        
    }
}