class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> freqMap=new HashMap<>();
        int res=0,i=0,maxFreq=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,freqMap.get(c));

            while((j-i+1)-maxFreq > k){
                freqMap.put(s.charAt(i),freqMap.get(s.charAt(i))-1);
                i++;
            }

            res=Math.max(res,j-i+1);
        }
        return res;
    }
}