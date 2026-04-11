class Solution {
    public List<List<Integer>> fun1(int[] nums){
     List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums); // o(nlogn)
        int n=nums.length;
        for(int i=0;i<n-2;i++){ // o(n*n)
            int j=i+1;
            int k=n-1;
        
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                List<Integer> arr=new ArrayList<>();
                if(sum==0){
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    if(!res.contains(arr)){
                        res.add(arr);
                    }
                    j++;
                    k--;
                }
                else if(sum>0){
                    k--;
                }else{
                    j++;   
                }
            }
        }
        return res;
        // overall tc: o(nlogn)+o(n*n)== o(n*n)       
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        Arrays.sort(nums); // o(nlogn)
        int n=nums.length;
        for(int i=0;i<n-2;i++){ // o(n*n)
            int j=i+1;
            int k=n-1;
        
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(List.of(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum>0){
                    k--;
                }else{
                    j++;   
                }
            }
        }
        return new ArrayList<>(res);
           
    }
}