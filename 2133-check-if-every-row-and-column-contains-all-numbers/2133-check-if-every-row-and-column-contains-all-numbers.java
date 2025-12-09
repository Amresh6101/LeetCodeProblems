class Solution {
    public boolean checkValid(int[][] matrix) {

       int n=matrix.length;
       for(int i=0;i<n;i++){
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        for(int j=0;j<matrix[0].length;j++){
            set.add(matrix[i][j]);
            set1.add(matrix[j][i]);
        }
        if(set.size()!=n || set1.size()!=n){
            return false;
        }
       } 

       return true;
        
    }
}