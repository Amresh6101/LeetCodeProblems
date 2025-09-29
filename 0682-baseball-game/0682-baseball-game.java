class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            if(str.equals("+")){
                int a=st.pop();
                int b=st.peek();
                int c=a+b;
                st.push(a);
                st.push(c);

            } else if(str.equals("D")){
                int dob=2*st.peek();
                st.push(dob);

            } else if(str.equals("C")){
                st.pop();

            } else{
                st.push(Integer.parseInt(str));
            }      
        }
        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
        
    }
}