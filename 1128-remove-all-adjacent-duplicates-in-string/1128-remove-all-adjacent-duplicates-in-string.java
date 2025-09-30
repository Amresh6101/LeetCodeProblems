class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch1);
            } 
            else {
                char ch=st.peek();
                if(ch!=ch1){
                    st.push(ch1);
                } 
                else{
                    st.pop();
                }             
            }
        }
        System.out.println(st);
        StringBuilder sb1=new StringBuilder("");
        while(!st.isEmpty()){
            sb1.append(st.pop());
        }   
        return sb1.reverse().toString();
    }
}