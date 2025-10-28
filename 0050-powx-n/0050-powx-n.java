class Solution {
    public double myPow(double x, int n) {
        double res=0;
        long N=n;
        if(N>0){
            res=fun(x,N);
            return res;
        }
        else if(N<0){
            res=1/fun(x,-N);
            return res;
        }
        return 1;
 
    }
    public double fun(double x,long n){
        if(n==0){
            return 1;
        }
        double fn=fun(x,n/2);
        if(n%2 ==0) return fn*fn;
        else{
            return x*fn*fn;
        }
    }
}