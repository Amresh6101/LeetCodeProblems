class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced=0;
        boolean[] used=new boolean[baskets.length];
        for(int i=0;i<fruits.length;i++){
            int f=fruits[i];
            boolean isPlaced=false;
            for(int j=0;j<baskets.length;j++){
                if(f<=baskets[j] && !used[j]){
                   used[j]=true;
                   isPlaced=true;
                   break;
                }
            }
            if(!isPlaced){
                unplaced++;
            }
        }
        
        return unplaced;
    }
}