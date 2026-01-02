class Solution {
    public int lengthOfLongestSubstring(String s) {


        // dynamic sliding window
        
        // basic ds window pattern template  880/988 testcase passed
        int wSize=0;
        
        for(int i=0;i<s.length();i++){
            Set<Character> list=new  HashSet<>();
            for(int j=i;j<s.length();j++){
                if(list.contains(s.charAt(j))){
                    break;
                }
                list.add(s.charAt(j));
                wSize=Math.max(wSize,j-i+1);

            }
        }

        return wSize;     
    }
}