class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length; 
       boolean found = false;
       int i = 0;
       int j = nums.length-1;
       int index = 0;
       while(i<=j){
        if(nums[i]== target){
           index=i;
           found = true;
           break;
        }else if(nums[j]==target){
            index=j;
            found = true;
            break;
        }
        i++;
        j--;
       }
       if(found){
        return index;
       }else{
        return -1;
       }
    }
}