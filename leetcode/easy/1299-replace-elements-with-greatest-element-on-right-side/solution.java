class Solution {
    public int[] replaceElements(int[] nums) {
        int n = nums.length;
        int [] arr= new int[n];
        int a = 0;
         int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=-1;
           for(int j=i+1;j<nums.length;j++){
             if(max<nums[j]){
            max=nums[j];
             }
           }
      
           arr[i]=max;
         
          
        }
        arr[arr.length-1]= -1;
        return arr;
        
        
    }
}