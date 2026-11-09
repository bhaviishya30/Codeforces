class Solution {
    public int countPrimes(int n) {
        int c=0;
     for(int i=2;i<n;i++){
        int ele=i;
        if(ele==2) c++;
        if(ele==3) c++;
        boolean flag=false;
        for(int j=2;j<ele;j++){
            if(ele%j==0){
               flag=true;
            }
        }
        if(!flag){
            c++;
        }
            
    }
    return c;
     
    }
}

