class Solution {
    public int maxArea(int[] h) {
    int i=0;
    int j=h.length-1;
    int maxarea=0;
    while(i<j){
        int width = j-i;
        int height = Math.min(h[i],h[j]);
        int area = width*height;
        maxarea= Math.max(area,maxarea);

        if(h[i]<h[j]){
            i++;
        }else{
            j--;
        }
    }
   return maxarea;
    

    }
}
       
        