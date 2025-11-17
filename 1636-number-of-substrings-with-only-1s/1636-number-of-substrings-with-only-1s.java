class Solution {
    public int numSub(String s) {
     
     long mod=1000000007L, ones=0, res=0;

     for(char ch: s.toCharArray()){
        if(ch=='1'){
            ones++;
        }
        else{
            long sum=((ones*(ones+1))/2) % mod;
            res= (res+sum);
            ones=0;
        }
     }
    long sum=((ones*(ones+1))/2) % mod;
    res= (res+sum);
     return (int)res;
        
    }
}