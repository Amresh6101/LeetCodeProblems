class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int[] res=new int[m+n];
    //    // Arrays.fill(res,0);
    //     int idx=0;

    //     int i=0;
    //     int j=0;
    //     while(i<m && j<n){
    //         int val1=nums1[i];
    //         int val2=nums2[j];
    //         if(val1<val2){
    //             res[idx++]=val1;
    //             i++;
    //         }
    //         else{
    //             res[idx++]=val2;
    //             j++;
    //         }
    //     }
    //     // two conditions left
    //     if(i==m){
    //         while(j<n){
    //             int val2=nums2[j];
    //             res[idx++]=val2;
    //             j++;
    //         }
    //     }
    //     if(j==n){
    //         while(i<m){
    //             int val1=nums1[i];
    //             res[idx++]=val1;
    //             i++;
    //         }
    //     }
    //     idx=0;
    //     for(int val: res){
    //         nums1[idx++]=val;
    //     }    


    // inplace merging
    int i=m-1;
    int j=n-1;
    int k=m+n-1;
    while(i>=0 && j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k]=nums1[i];
            k--;
            i--;
        }
        else{
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    } 
    while (j >= 0) {           
      nums1[k--] = nums2[j--];
    }  
    
    }
}