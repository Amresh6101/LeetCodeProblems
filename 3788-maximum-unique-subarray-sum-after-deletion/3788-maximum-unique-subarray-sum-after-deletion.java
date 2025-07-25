class Solution {
    // jaha bhi uniqueness ka bta ho set try kro!
    public int maxSum(int[] nums) {

        Set<Integer> set1=new HashSet<>();
        int negativeMax=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negativeMax=Math.max(negativeMax,nums[i]);
            }
            else{
                set1.add(nums[i]);
            }
        }
        if(set1.size()==0){
            return negativeMax;
        }
        else{
        int sum=0;
        Iterator<Integer> it=set1.iterator();
        while(it.hasNext()){
            sum+=it.next();
        }
        return Math.max(sum,negativeMax);
        }
        
    }
}