class Solution {
    public int lengthOfLongestSubstring(String s) {

         Set<Character> set=new HashSet<>();
         int i=0;
         int j=0;
         int res=0;

         while(j<s.length()){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            res=Math.max(res,j-i+1);
            j++;
         }
         return res;
    }
}