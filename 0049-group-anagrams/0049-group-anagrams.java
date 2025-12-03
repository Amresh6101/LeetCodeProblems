class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm1=new HashMap<>();
        for(String s: strs){
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String rev=new String(charArray);
            System.out.println("reversed String:"+rev);
            if(hm1.containsKey(rev)){
                List<String> temp=hm1.get(rev);
                temp.add(s);
                hm1.put(rev,temp);

            }
            else{
                List<String> list=new ArrayList<>();
                list.add(s);
                hm1.put(rev,list);
            }
            
        }
        return new ArrayList<>(hm1.values());    
    }
}