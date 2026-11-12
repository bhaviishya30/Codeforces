class Solution {
    public int countOdds(int low, int high) {
        int c=0;
       int i=low;
       int j=high;
        if(i==j && i%2==0){
            return 0;
        }
        if(i==j && i%2!=0){
            return 1;
        }

       while(i<j){
       
        if(i%2!=0){
            c++;
        }
        if( j%2!=0){
            c++;
        }
        i++;
        j--;
       }
        return c;
    }
}