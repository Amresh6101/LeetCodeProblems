class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> set=new HashSet<>();
        int n=s.length();
        Set<String> list=new HashSet<>();

        for(int i=0;i<=n-10;i++){
            String str=s.substring(i,i+10);

            if(set.contains(str)){
                list.add(str);
            }
            else{
               set.add(str);
            }
                       
        }
        List<String> res=new ArrayList<>();
        for(String str1: list){
            res.add(str1);
        }
        return res;
    }
}