class TempPair{
    String word;
    int steps;
    public TempPair(String word,int steps){
        this.word=word;
        this.steps=steps;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // if end word is not present in the list return 0

        if(wordList.contains(endWord)==false) return 0;

        
        Set<String> set=new HashSet<>(wordList);
        Queue<TempPair> queue=new LinkedList<>();
        queue.add(new TempPair(beginWord,1));
        set.remove(beginWord);

        // iterate over queue
        while(!queue.isEmpty()){
            TempPair tempPair=queue.poll();

            String word=tempPair.word;
            int steps=tempPair.steps;

            if(word.equals(endWord)) return steps;

            // word=hit
            // steps=1;
            for(int i=0;i<word.length();i++){          
                for(char ch='a';ch<='z';ch++){
                    char[] tempCharArray=word.toCharArray();
                    tempCharArray[i]=ch;
                    String tempStr=new String(tempCharArray);
                    if(set.contains(tempStr)){
                        set.remove(tempStr);
                        queue.add(new TempPair(tempStr,steps+1));
                    }
                    
                }
            }
        }

        return 0;       
    }
}