class Solution {
    public long[] sumOfThree(long num) {

        if(num%3 !=0) return new long[]{};


        long divide=num/(long)3;
        System.out.println(divide);

        long a=divide-1;

        return new long[]{a,a+1,a+2};

        
    }
}