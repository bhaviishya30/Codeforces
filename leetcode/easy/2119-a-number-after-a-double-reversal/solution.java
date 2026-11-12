class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0,rev2=0;
        int ele=num;
        while(ele!=0){
            int last=ele%10;
            rev1=rev1*10+last;
            ele/=10;
        }
          while(rev1!=0){
            int last2=rev1%10;
            rev2=rev2*10+last2;
            rev1/=10;
        }
        if(rev2==num){
            return true;
        }else{
            return false;
        }
        
    }
}