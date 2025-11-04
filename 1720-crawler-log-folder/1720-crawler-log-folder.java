class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();

        for(int i=0;i<logs.length;i++){
            String s=logs[i];
            if(s.equals("../")){
                if(st.size()==0){
                    continue;
                }
                else{
                    st.pop();
                }
            }
            else if(s.equals("./")){
                 continue;
            }
            else{
                st.push(s);
            }
        }
        System.out.println(st);

        return st.size();
        
    }
}