class Solution {
    public int totalFruit(int[] fruits) {

        int n=fruits.length;
        int maxLen=0,i=0,j=0;
        
        Map<Integer,Integer> map1=new HashMap<>();

        while(j<n){
            map1.put(fruits[j],map1.getOrDefault(fruits[j],0)+1);

            while(map1.size()>=3){
                map1.put(fruits[i],map1.get(fruits[i])-1);
                if(map1.get(fruits[i])==0){
                    map1.remove(fruits[i]);
                }
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        // Set<Integer> set=new HashSet<>();
        // while(j<n){
        //     set.add(fruits[j]);
        //     while(set.size()>2){
        //         set.remove(fruits[i]);
        //         i++;
        //     }
        //     maxLen=Math.max(maxLen,j-i+1);
        //     j++;
        // }
        // we can not use set bcoze while remove all element remove ho rha hai hume sirf count reduce krna hai so that we are using hashMap to store count of each element;
        // for(int i=0;i<n;i++){
        //     Set<Integer> set=new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         set.add(fruits[j]);
        //         if(set.size()<=2){
        //             maxLen=Math.max(maxLen,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        return maxLen;
        
    }
}