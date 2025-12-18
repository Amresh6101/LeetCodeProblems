class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        // we have three case
        List<int[]> list=new ArrayList<>();
        int i=0;
        int n=intervals.length;
        // before merging
        while(i<n && newInterval[0]>intervals[i][1]){
            list.add(intervals[i]);
            i++;
        }
        // merging
        while(i<n && newInterval[1]>=intervals[i][0]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        list.add(newInterval);
        // after merging
        while(i<n){
            list.add(intervals[i]);
            i++;
        }

        int matSize=list.size();
        int[][] res=new int[matSize][2];
        int idx=0;
        for(int[] arr: list){
            res[idx++]=arr;
        }
        return res;       
    }
}