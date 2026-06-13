class Solution {
    public boolean checkInclusion(String s1, String s2) {


        // setp-1: sort s1
        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        String sortedString=new String(ch);

        System.out.println("Sorted String:"+ sortedString);

        int windowSize=s1.length();

        int i=0;
        int j=0;

        while(j<s2.length()){
            if(j-i+1 != windowSize){
                j++;
            }
            else{
                String subString=s2.substring(i,j+1);
                char[] ch1=subString.toCharArray();
                Arrays.sort(ch1);
                String newString=new String(ch1);
                if(newString.equals(sortedString)){
                    return true;
                }
                i++;
                j++;
            }
        }
        return false;
        
    }
}