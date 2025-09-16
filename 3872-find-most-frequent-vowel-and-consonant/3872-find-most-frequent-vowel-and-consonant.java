class Solution {
    public int maxFreqSum(String s) {
        PriorityQueue<Map<Character,Integer>> heap1=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Map<Character,Integer>> heap2=new PriorityQueue<>(Collections.reverseOrder());

        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch1=='a' || ch1=='e' ||ch1=='i' ||ch1=='o' ||ch1=='u'){
                map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            }
            else{
                map2.put(ch1,map2.getOrDefault(ch1,0)+1);
            }
        }

        int vowelCount=0;
        int constValue=0;

        for(Map.Entry<Character,Integer> e1: map1.entrySet()){
            int val1=e1.getValue();
            vowelCount=Math.max(vowelCount,val1);
        }   
        for(Map.Entry<Character,Integer> e1: map2.entrySet()){
            int val1=e1.getValue();
            constValue=Math.max(constValue,val1);
        }
        System.out.println(vowelCount);
        System.out.println(constValue);
        return   vowelCount+constValue;
    }
}