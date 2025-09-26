class Solution {
    public boolean canBeValid(String s, String locked) {

        int len=s.length();
        if(len%2!=0) return false;

        Stack<Integer> openBrackets =new Stack<>();
        Stack<Integer> unlocked =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=locked.charAt(i);
            if(ch2=='0'){
               unlocked.push(i);
            }
            else if(ch1=='('){
                openBrackets.push(i);
            }
            else if(ch1==')'){
                if(openBrackets.size()!=0) openBrackets.pop();
                else if(unlocked.size()!=0) unlocked.pop();
                else{
                    return false;
                }
            }
        }
        while (
            !openBrackets.empty() &&
            !unlocked.empty() &&
            openBrackets.peek() < unlocked.peek()
        ) {
            openBrackets.pop();
            unlocked.pop();
        }

        if (!openBrackets.empty()) {
            return false;
        }

        return true;     
    }
}