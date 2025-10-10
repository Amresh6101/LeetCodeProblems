
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int n=temp.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(st.size()==0){
                st.push(i);
                res.add(0);
            }
            else if(st.size()>0 && temp[st.peek()]>temp[i]){
                res.add(st.peek()-i);
            }
            else{
                while(st.size()>0 && temp[st.peek()]<=temp[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res.add(0);
                }
                else{
                    res.add(st.peek()-i);
                }
            }
            st.push(i);

        }

        int idx=0;
        Collections.reverse(res);
        int[] arr=new int[res.size()];
        for(int val: res){
            arr[idx++]=val;
        }
        return arr;       
    }
}