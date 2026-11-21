class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] arr = new String[rain.length];
        int p=0;
        int n=rain.length;
        int al=0;
        int bo=0;
        for(int i=0;i<rain.length-1;i++){
          if(rain[i]==rain[i+1] && rain[i]==1 && al<=bo){
              arr[p]="Alice";
              p++;
              al++;
          }else if(rain[i]==1 || bo<al){
              arr[p]="Bob";
              p++;
              bo++;
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