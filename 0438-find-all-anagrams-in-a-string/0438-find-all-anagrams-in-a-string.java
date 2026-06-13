class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        

        String sortedStr=sortFunction(p);
        List<Integer> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<s.length()){
            if(j-i+1 == p.length()){
                String str=s.substring(i,j+1);
                String sStr=sortFunction(str);
                if(sStr.equals(sortedStr)){
                    res.add(i);
                }
                i++;

            }
            j++;
        }
        return res;
        

    }
    public String sortFunction(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}