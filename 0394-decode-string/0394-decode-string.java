class Solution {
    public String decodeString(String s) {
        // two stack
        Stack<String> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int count=0;
        String s1=new String();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            // digit
            if(ch>= '0' && ch<='9'){
                count=(10*count)+(ch-'0');
            }   
            else if(ch=='['){
                st1.push(s1);
                st2.push(count);
                s1="";
                count=0;
            }   
            else if(ch==']'){
                String temp1=st1.pop();
                int n1=st2.pop();

                StringBuilder sb1=new StringBuilder("");
                sb1.append(temp1);

                for(int j=0;j<n1;j++){
                    sb1.append(s1);
                }
                s1=sb1.toString();
            }   
            else{
                s1=s1+Character.toString(ch);
            }
        }
        return s1;
    }
}