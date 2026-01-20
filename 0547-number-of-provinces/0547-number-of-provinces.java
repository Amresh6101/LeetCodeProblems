class Solution {
    public int findCircleNum(int[][] isConnected) {

        // first make List<List<Integer>> for graph representation
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1){
                    adjList.get(i).add(j);
                }
            }
        }
        // print adjacency list
        for (int i = 0; i < isConnected.length; i++) {
            System.out.println(i + " -> " + adjList.get(i));
        }

        int[] visitedArray=new int[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(visitedArray[i]==0){
                count++;
                dfs(visitedArray,i,adjList);
            }
        }
        return count;              
    }
    public void dfs(int[] visitedArray, int node, List<List<Integer>> adjList ){

        visitedArray[node]=1;
        for(int curr: adjList.get(node)){
            if(visitedArray[curr]==0){
                dfs(visitedArray,curr,adjList);
            }
        }

    }
}