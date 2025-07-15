class Solution {
    public boolean isValid(String word) {
        int len=word.length();
        if(len<3) return false;

        int countVowel=0;
        int countConst=0;

        for(int i=0;i<len;i++){
            char ch1=word.charAt(i);
            if(Character.isLetter(ch1)){
                char ch=Character.toLowerCase(ch1);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                    countVowel++;
                }
                else{
                    countConst++;
                }
            }
            else if(!Character.isDigit(ch1)) return false;
 
        }
        if(countVowel>=1 && countConst>=1){
            return true;
        }
        else{
            return false;
        }
        
    }
}