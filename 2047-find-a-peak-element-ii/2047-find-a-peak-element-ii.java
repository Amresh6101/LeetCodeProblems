class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int max_rows=0;
            for(int i=0;i<n;i++){
                if(mat[max_rows][mid]<mat[i][mid]){
                    max_rows=i;
                }
            }
            if ((mid == 0 || mat[max_rows][mid] > mat[max_rows][mid - 1]) && 
                (mid == m - 1 || mat[max_rows][mid] > mat[max_rows][mid + 1]))        {
                return new int[]{max_rows,mid};
            }
            else if(mid > 0 && mat[max_rows][mid - 1] > mat[max_rows][mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
       return new int[]{-1,-1}; 
        
    }
}