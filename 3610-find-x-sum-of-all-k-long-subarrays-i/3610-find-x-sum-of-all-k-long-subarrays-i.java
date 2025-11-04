class Solution {
    public int[] findXSum(int[] nums, int k, int x) {


        Map<Integer,Integer> map1=new HashMap<>();
        List<Integer> res=new ArrayList<>();

        int i=0;
        int j=0;
        // normal slidinng window concept;
        while(j<nums.length){
            map1.put(nums[j], map1.getOrDefault(nums[j],0)+1);

            if((j-i+1)==k){
                res.add(sumOfTopX(map1,x));

                // logic to remove ith element to shift the window;
                map1.put(nums[i], map1.get(nums[i])-1);
                if(map1.get(nums[i])==0) map1.remove(nums[i]);

                i++;
            }
            j++;
        }
        // conversion from list to array
        return res.stream().mapToInt(Integer::intValue).toArray();      
    }
    public int sumOfTopX(Map<Integer,Integer> map1, int x){
        PriorityQueue<int[]> heap1=new PriorityQueue<>(
           (a, b) -> {
                if (b[0] == a[0]) return b[1] - a[1]; // tie-break by value
                return b[0] - a[0];
            }
        );

        for(Map.Entry<Integer,Integer> e1: map1.entrySet()){
            heap1.offer(new int[]{e1.getValue(),e1.getKey()});
        }
        int sum=0;
        while(x > 0 && !heap1.isEmpty()){
            int[] top=heap1.poll();
            int freq=top[0];
            int val=top[1];
            sum+=freq*val;
            x--;
        }
        return sum;
    }
}