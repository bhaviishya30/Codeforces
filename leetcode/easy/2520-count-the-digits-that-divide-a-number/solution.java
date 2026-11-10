class Solution {
    public int countDigits(int num) {
        int c=0;
        int ele=num;
        while(ele!=0){
            int last = ele%10;
            if(num%last==0){
                c++;
            }
            ele/=10;
        }
        return c;
        
    }
}