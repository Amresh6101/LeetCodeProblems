class Solution {
    public String reorderSpaces(String text) {
        int numWords = 0;
        int numSpaces = 0;
        int textLength = text.length();
        
        for(int i = 0; i < textLength; i++ ) {
            if(text.charAt(i) == ' ') numSpaces++; 
            if(text.charAt(i) != ' ' && (i + 1 == textLength ||  text.charAt(i + 1) == ' ') ) numWords++; 
        }
               
        int avgSpaces = 0; 
        
        if(numWords < 2) {
            avgSpaces = numSpaces;  
        } else {
            avgSpaces = numSpaces / (numWords - 1);
        }
        
        
        int i = 0;
        int spaces = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i < textLength) {
            while(i < textLength && text.charAt(i) == ' ') i++; 
            while(i < textLength && text.charAt(i) != ' ') { 
                sb.append(text.charAt(i));  
                i++;
            }
            while(sb.length() < textLength  && spaces < avgSpaces) {    
                sb.append(' ');
                spaces++;
            }       
            i++; 
            spaces = 0; 
        }        
        while(sb.length() < textLength) sb.append(' '); 
                       
        return sb.toString();        
    }
}