class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        int sub=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                     sub = j-i;
                      if(sub<=k){
                        flag = true;
                    }
                  }
                
            }
        }
        return flag;
    }
}