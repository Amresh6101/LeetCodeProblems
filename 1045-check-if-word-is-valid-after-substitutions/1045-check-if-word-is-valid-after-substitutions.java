class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            st.push(ch1);
            if(ch1=='c' && st.size()>=3){
                char a,b,c;
                c=st.pop();
                b=st.pop();
                a=st.pop();
                if(a=='a' && b=='b' && c=='c'){
                    //
                }else{
                    st.push(a);
                    st.push(b);
                    st.push(c);
                }

            }
            else if(ch1=='c') return false;

        }
        return st.empty();     
    }
}