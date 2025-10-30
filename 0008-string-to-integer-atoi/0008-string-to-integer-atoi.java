class Solution {
    public int myAtoi(String s) {
        //1. ignore whitespace
        //2. check signed character if it is +123-> 123
        // -124->124
        // conversion 

        int i=0;
        int sign= 1;
        long num=0;

        //1. remove white space
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        //2. check signed character
        if(i<s.length()){
            if(s.charAt(i)=='-'){
               sign=-1;
               i++;
            } 
            else if(s.charAt(i)=='+'){
                i++;
            }
        }

        // conversion

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            num=num*10+digit;

            if(sign*num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*num<Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign*num);

        
    }
}