class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n=rooms.size();
        boolean[] visitedArray=new boolean[n];

        dfs(0,rooms,visitedArray);
        for(boolean v: visitedArray){
            if(v==false) return false;
        }
        return true;       
    }
    public void dfs(int room, List<List<Integer>> rooms, boolean[] visitedArray){
        
        visitedArray[room]=true;
        for(int key: rooms.get(room)){
            if(visitedArray[key]==false){
                dfs(key,rooms,visitedArray);
            }
        }
    }
}