class Solution {
    public List<Integer> findPeaks(int[] mou) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i=1;i<mou.length-1;i++){
            if(mou[i]>mou[i-1] && mou[i]>mou[i+1]){
                arr.add(i);
            }
        }
        return arr;
        
    }
}