class Solution {
    public int minCost(String colors, int[] neededTime) {

        Stack<Integer> st=new Stack<>();
        int res=0;
        for(int i=0;i<colors.length();i++){
            char ch=colors.charAt(i);

            if(st.isEmpty()){
                st.push(i);
            }
            else{
                if(ch==colors.charAt(st.peek())){
                    int val1=neededTime[i];
                    int val2=neededTime[st.peek()];
                    if(val2<val1){
                        res+=val2;
                        st.pop();
                        st.push(i);
                    }
                    else{ // val1 is smaller 
                        res+=val1;
                    }
                }
                else{
                    st.push(i);
                }
            }
        }

        return res;
        
    }
}