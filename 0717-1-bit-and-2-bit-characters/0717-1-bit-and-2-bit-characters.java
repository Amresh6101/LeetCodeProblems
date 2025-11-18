class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        int n=bits.length;

        if(n==1){
            if(bits[0]==0) return true;
            else return false;
        }
        // else{
        //     if(bits[n-1]==0){
        //         if(bits[n-2]==1) return false;
        //         else return true;
        //     }
        //     else{
        //         return false;
        //     }
        // }  

        int i=0;
        while(i<n){
            if(bits[i]==1){
                if(bits[i+1]==0 || bits[i+1]==1){
                    i+=2;
                }         
            }
            else if(bits[i]==0 && i==n-1){
                 return true;
            }
            else{
                i++;
            }
        } 
        return false;    
    }
}