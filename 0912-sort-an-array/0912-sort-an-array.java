class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> heap1=new PriorityQueue<>();
        for(int num: nums){
            heap1.add(num);
        }

        int[] res=new int[heap1.size()];
        int idx=0;
        while(heap1.size()!=0){
            res[idx++]=heap1.poll();
        }
        return res;
    }
}