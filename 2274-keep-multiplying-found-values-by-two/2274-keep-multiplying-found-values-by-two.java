class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int val:nums){
            arr1.add(val);
        }
        System.out.println(arr1);
        while(arr1.contains(original)){
            original=2*original;

        }
        return original;
        
    }
}