class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
        for(int i=0;i<mat.length;i++){
            int low=mat[i][0];
            int high=mat[i][mat[i].length-1];
            if(low<=target && target<=high){
                int left=0;
                int right=mat[i].length-1;

                while(left<=right){
                    int mid=left+(right-left)/2;

                    if(mat[i][mid]==target) return true;
                    else if(mat[i][mid]>target){
                        right=mid-1;
                    }
                    else{
                        left=mid+1;
                    }
                }

            }
            else{
                continue;
            }
        }
        return false;
                
    }
}