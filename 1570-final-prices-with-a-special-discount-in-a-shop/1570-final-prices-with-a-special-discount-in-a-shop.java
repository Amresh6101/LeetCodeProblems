class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        int n=prices.length;

        for(int i=n-1;i>=0;i--){

            int val=prices[i];

            if(st.size()==0){
                st.push(val);
                arr1.add(val);
            }
            else if(st.size()>0 && st.peek()<val){
                arr1.add(val-st.peek());
            }
            else{
                while(st.size()>0 && st.peek()>val){
                    st.pop();
                }
                if(st.size()==0){
                    arr1.add(val);
                }
                else{
                    arr1.add(val-st.peek());
                }
            }
            st.push(val);
        }

        Collections.reverse(arr1);
        int[] arr=new int[ arr1.size()];
        int idx=0;
        for(int val: arr1){
            arr[idx++]=val;
        }
        return arr;
        
    }
}