class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(map.get(0));
        System.out.println(arr1);
        for(int i=0;i<nums.length;i++){
            int targetToFind=target-nums[i];
            if(map.containsKey(targetToFind)){
                arr[0]=map.get(targetToFind);
                arr[1]=i;
            }
            map.put(nums[i],i);
        }

        return arr;

    }
}