class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        if(s.length()%2 ==1) return false;

        Stack<Character> st1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch1=='(' || ch1=='{' || ch1=='['){
                st1.push(ch1);
            }
            else{
                if(ch1=='}'){
                    if(!st1.isEmpty()){
                        char ch=st1.peek();
                        if(ch=='{'){
                            st1.pop();
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                    }

                }else if(ch1==']'){
                    if(!st1.isEmpty()){
                        char ch=st1.peek();
                        if(ch=='['){
                            st1.pop();
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                    }

                }
                else{
                    if(!st1.isEmpty()){
                        char ch=st1.peek();
                        if(ch=='('){
                            st1.pop();
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                    }

                }

            }
        }
        if(st1.isEmpty()) return true;
        else return false;
       
    }
}