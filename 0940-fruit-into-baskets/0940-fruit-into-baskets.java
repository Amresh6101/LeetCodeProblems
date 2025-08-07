class Solution {
    public int totalFruit(int[] fruits) {
        int start=0;
        int end=0;
        int res=0;
        int len=fruits.length;
        HashMap<Integer,Integer> hm1=new HashMap<>();
        while(end<len){
            hm1.put(fruits[end],hm1.getOrDefault(fruits[end],0)+1);

            while(hm1.size()>=3){
                hm1.put(fruits[start],hm1.get(fruits[start])-1);
                if(hm1.get(fruits[start])==0){
                    hm1.remove(fruits[start]);
                   
                }
                 start++;
                
            }
            int currentLen=end-start+1;
            res=Math.max(currentLen,res);
            end++;
        }
        return res;   
    }
}