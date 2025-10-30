class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;      
        if(word.contains(String.valueOf(ch))){
            int idx=word.indexOf(ch);
            Stack<Character> st=new Stack<>();
            while(i<=idx){
                st.push(word.charAt(i));
                i++;
            }
            StringBuilder sb1=new StringBuilder("");
            while(!st.isEmpty()){
                sb1.append(st.pop());
            }
            System.out.println(sb1);
            while(i<word.length()){
                sb1.append(word.charAt(i));
                i++;
            }
            return sb1.toString();

        }
        else{
            return word;
        }
        
    }
}