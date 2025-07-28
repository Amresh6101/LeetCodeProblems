class Solution {
    public int countHillValley(int[] arr) {
        ArrayList<Integer> res=removeAdja(arr);
        System.out.println(res);
        int count=0;
        for(int i=1;i<res.size()-1;i++){
            int val1=res.get(i-1);
            int val2=res.get(i+1);
            int currVal=res.get(i);
            if(currVal>val1 && currVal>val2){
                count++;
            }
            else if(currVal< val1 && currVal< val2){
                count++;
            }
        }
        return count;
    }
    public ArrayList<Integer> removeAdja(int[] arr){
        ArrayList<Integer> temp=new ArrayList<>();
        if(arr.length==0)
        return temp;
        temp.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                temp.add(arr[i]);
            }
        }
        return temp;
    }
}