class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int maxArea=0;
        int distance;
        int area;
        while(i<j){
            distance=j-i;
            area=distance*Math.min(height[i],height[j]);
            maxArea=Math.max(area,maxArea);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
        
    }
}