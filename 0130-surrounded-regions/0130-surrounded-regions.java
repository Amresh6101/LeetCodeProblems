class Solution {
    public void solve(char[][] board) {


        // find first row, last row, first col and last col
        // if u find any 0 mark them as #
        int row=board.length;
        int col=board[0].length;


        // traverse first and last column

        for(int i=0;i<row;i++){
            if(board[i][0]=='O') dfs(i,0,board);
            if(board[i][col-1]=='O') dfs(i,col-1,board);
        }

        // traverse first and last rows
        for(int j=0;j<col;j++){
            if(board[0][j]=='O') dfs(0,j,board);
            if(board[row-1][j]=='O') dfs(row-1,j,board);
        }

        // now flip regions remaing O-> X and #-> O wappis kro
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='#') board[i][j]='O';
            }
        }        
    }
    public void dfs(int r, int c, char[][] board){

        // base conditions
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!='O')
        return ;

        board[r][c]='#';

        dfs(r+1,c,board);
        dfs(r-1,c,board);
        dfs(r,c-1,board);
        dfs(r,c+1,board);

    }
}