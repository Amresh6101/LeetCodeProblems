class Solution {
    public boolean isValidSudoku(char[][] board) {

        int rows=board.length;
        int cols=board[0].length;

        HashSet<Character> rowSet[]=new HashSet[9];
        HashSet<Character> colSet[]=new HashSet[9];
        HashSet<Character> boxSet[]=new HashSet[9];

        for(int i=0;i<9;i++){
            rowSet[i]=new HashSet<>();
            colSet[i]=new HashSet<>();
            boxSet[i]=new HashSet<>();
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                char ch=board[i][j];     

                if(ch=='.') continue;

                if(ch<'1' || ch>'9') return false;
                
                int boxIndx=(i/3)*3+(j/3);

                if(rowSet[i].contains(ch)){

                    return false;
                }
                if(colSet[j].contains(ch)){

                    return false;
                }
                if(boxSet[boxIndx].contains(ch)){
                    return false;
                }

                rowSet[i].add(ch);
                colSet[j].add(ch);
                boxSet[boxIndx].add(ch);

            }
        }
        return true;        
    }
}