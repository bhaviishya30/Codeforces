class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int alice=10;
        int bob=9;
       while(n!=0){
        n=n-alice;
        if(n<bob){
            return true;
        }
        alice-=2;
        n=n-bob;
        if(n<alice){
            return false;
        }
        bob-=2;

       }
       return true;
    }
}