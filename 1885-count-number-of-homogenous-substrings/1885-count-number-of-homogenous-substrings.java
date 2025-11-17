class Solution {
    public int countHomogenous(String s) {
        long mod=1000000007L,res=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1==ch2){
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