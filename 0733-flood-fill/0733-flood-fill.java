class Solution {
    int rows;
    int cols;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        rows=image.length;
        cols=image[0].length;

        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    public void dfs(int[][] image,int i,int j,int newClr,int oldClr){

        if(i<0 || i>=rows || j<0 ||j>=cols || image[i][j]!=oldClr || image[i][j]==newClr)
        return;

        image[i][j]=newClr;

        dfs(image,i+1,j,newClr,oldClr);
        dfs(image,i-1,j,newClr,oldClr);
        dfs(image,i,j+1,newClr,oldClr);
        dfs(image,i,j-1,newClr,oldClr);

    }
}