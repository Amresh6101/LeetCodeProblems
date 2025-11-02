class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ast.length;i++){
            int val=ast[i];
            if(st.size()==0){
                st.push(val);     
            }
            else{
                if(val>0){
                    st.push(val);
                }
                else{
                    while(st.size()!=0 && st.peek()>0 && st.peek()< -val){
                        st.pop();
                    }
                    if(st.size()==0 || st.peek()<0){
                        st.push(val);
                    }
                    if(st.peek()==-val){
                        st.pop();
                    }
                    
                }
            }
        }
        System.out.println(st);
        int[] res=new int[st.size()];
        int idx=st.size()-1;
        while(st.size()!=0){
            res[idx]=st.pop();
            idx--;
        }
        return res;
        
    }
}