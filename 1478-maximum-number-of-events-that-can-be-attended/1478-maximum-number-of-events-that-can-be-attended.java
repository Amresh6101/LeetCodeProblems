class Solution {
    public int maxEvents(int[][] events) {
        // sort start day
        Arrays.sort(events,(a,b)->(a[0]-b[0]));

        // for input:
        // [[1, 3], [1, 2], [3, 4], [2, 3]]
        // after sorting ,it become
        // 1->2
        // 1->3
        // 2->3
        // 3->4

        int day=1;
        PriorityQueue<Integer> heap1=new PriorityQueue<>();
        int len=events.length;
        int i=0;
        int attended=0;
        
        // maxDay
        int lastDay=0;
        for(int[] event: events){
            lastDay=Math.max(lastDay,event[1]);
        }

        while(day<=lastDay){

            while(i<len && events[i][0]==day){
                heap1.add(events[i][1]);
                i++;
            }

            while(!heap1.isEmpty() && heap1.peek()<day){
                heap1.poll();
            }

            if(!heap1.isEmpty()){
                heap1.poll();
                attended++;
            }
            day++;
        }
        return attended;
    }
}