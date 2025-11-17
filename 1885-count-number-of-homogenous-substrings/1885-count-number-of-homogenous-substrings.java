class Solution {
    public int countHomogenous(String s) {
        long mod=1000000007L,res=0;
        int i=0,j=0;

        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                long window=j-i;
                long subStr=(window*(window+1)/2) % mod;
                res=(res+subStr);
                i=j;
                j++;
            }
        }
        long window=j-i;
        long subStr=(window*(window+1)/2) % mod;
        res=(res+subStr);
    
        return (int)res;
        
    }
}