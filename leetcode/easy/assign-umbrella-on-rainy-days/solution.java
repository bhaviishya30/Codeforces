class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] arr = new String[rain.length];
        int p=0;
        int n=rain.length;
        for(int i=0;i<rain.length-1;i++){
          if(rain[i]==rain[i+1] && rain[i]==1){
              arr[p]="Alice";
              p++;
          }else if(rain[i]==1){
              arr[p]="Bob";
              p++;
          }else{
              arr[p]="None";
              p++;
          }
          
    }
         if(rain[n-1]==1){
            arr[p]="Bob";
        }else{
            arr[p]="None";
        }
        return arr;
}
}