class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        // we have to acheive this 

        // num1=k*num2+(sum_of_k_power_of_2);
        // where sum_of_k_power_of_2 means eg: k=4, 1+2+4+8=15

        // sum_of_k_power_of_2= num1-k*num2;

        for(int k=1;k<=60;k++){
            long sum_of_k_power_of_2=(long)num1-(long)k*num2;

            if(sum_of_k_power_of_2<0){
                continue;
            }
            int bit=Long.bitCount(sum_of_k_power_of_2);

            if(bit<=k && sum_of_k_power_of_2>=k){
                return k;
            }

        }
        return -1;
        
    }
}