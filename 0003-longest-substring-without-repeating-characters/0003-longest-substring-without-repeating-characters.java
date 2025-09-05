class Solution {
    public int lengthOfLongestSubstring(String s) {

        // create map
        // 1. check element is present or not

        HashMap<Character,Integer> map1=new HashMap<>();
        // ele-index
        
        int left=0;
        int right=0;
        int maxLen=0;

        while(right<s.length()){
            // if charAt(i) not present in hashmap
            if(!map1.containsKey(s.charAt(right))){
                map1.put(s.charAt(right),right);
                int len=right-left+1;
                maxLen=Math.max(len,maxLen);               
            }

            // if element is present in hashMap
            else{
                int idx=map1.get(s.charAt(right));
                if(idx>=left){
                    left=idx+1;                 
                }
                map1.put(s.charAt(right),right);
                int len=right-left+1;
                maxLen=Math.max(len,maxLen); 
            }
            right++;
        }
        return maxLen;
    }
}