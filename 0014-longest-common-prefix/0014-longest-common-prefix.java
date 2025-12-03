class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen=strs[0].length();
   
        for(int i=0;i<strs.length-1;i++){
            String str1=strs[i];
            String str2=strs[i+1];
            int res=solve(str1,str2);
            minLen=Math.min(res,minLen);
        }
        return strs[0].substring(0,minLen);      
    }
    public int solve(String str1,String str2){
        int i=0;
        int j=0;
        while(i<str1.length() && i<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return str1.substring(0,i).length();
    }
}