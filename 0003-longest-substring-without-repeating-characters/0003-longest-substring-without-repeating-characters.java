class Solution {
    public int lengthOfLongestSubstring(String s) {


        // dynamic sliding window
        
        // basic ds window pattern template 
        int wSize=0;
        
        // this is brute approach
        // for(int i=0;i<s.length();i++){
        //     Set<Character> list=new  HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(list.contains(s.charAt(j))){
        //             break;
        //         }
        //         list.add(s.charAt(j));
        //         wSize=Math.max(wSize,j-i+1);

        //     }
        // }

        // return wSize; 


        // optimization

        int i=0,
            j=0;
        Set<Character> set=new HashSet<>();
        while(j<s.length()){

            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            wSize=Math.max(wSize,j-i+1);

            j++;
        }  
        return wSize;      
    }
}