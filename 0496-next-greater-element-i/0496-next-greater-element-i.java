class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<>();
        for(int v: nums1){
            list1.add(v);
        }
        List<Integer> list2=new ArrayList<>();
        for(int v: nums2){
            list2.add(v);
        }
        List<Integer> list3=new ArrayList<>();

        Map<Integer,Integer> hm1=new HashMap<>();
        for(int val: list1){
            int idx=list2.indexOf(val);
            int temp=nge(list2,val,idx);
            list3.add(temp);
        } 
        int[] fRes=new int[list3.size()];
        int idx=0;
        for(int v: list3){
            fRes[idx++]=v;
        } 
        return fRes;          
    }
    public int nge(List<Integer> list2,int val,int idx){
        Stack<Integer> st=new Stack<>();
        int n=list2.size();
        if(idx==n-1) return -1;
        int res=-1;

        for(int i=n-1;i>idx;i--){
            int a=list2.get(i);
            if(a>val){
                res=a;
            }
        }
        return res;
    }
}