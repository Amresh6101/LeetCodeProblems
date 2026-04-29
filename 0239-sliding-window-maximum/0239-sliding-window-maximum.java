class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // logic simple use queue/DS where we can add and remove the things from both the endpoints where we can add and remove element from the both element

        LinkedList<Integer> q=new LinkedList<>();

        int i=0,j=0;
        List<Integer> res=new ArrayList<>();


        while(j<nums.length){
            // calculations
            while(q.size()>0 && q.getLast()<nums[j]){
                q.removeLast();
            }
            q.addLast(nums[j]);
            
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 ==k){
                // find answer
                res.add(q.getFirst());
                // slide the window
                if(nums[i]==q.getFirst()){
                    q.removeFirst();
                }
                i++;
                j++;
            }
        }

        System.out.println(res);

        int[] arr=new int[res.size()];

        int idx=0;
        for(int v: res){
            arr[idx++]=v;
        }
        return arr;

        // int[] arr1=res.toArray(new int[res.size()]);
        // return arr1;
        // // return new int[]{1,9};
    
    }
}