class Solution {
    public String[] divideString(String s, int k, char fill) {

        ArrayList<String> temp=new ArrayList<>();           
        StringBuilder sb1=new StringBuilder(s);
        while((sb1.length()%k)!=0){
            sb1.append(fill);
        }
        for(int i=0;i<=sb1.length()-k;i+=k){
            temp.add(sb1.substring(i,i+k));
        }
               
        String[] res=new String[temp.size()];
        int idx=0;
        for(String str1: temp){
              res[idx++]=str1;
        }
        return res;       
    }

}