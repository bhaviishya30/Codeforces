class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int ele=i;
            int num=i;
            boolean flag=true;
            while(ele!=0){
                int last=ele%10;
                if(last==0 || num%last!=0  ){
                   flag=false;
                   break;
                }
                ele/=10;
            }
            if(flag){
                arr.add(num);
            }
        }
        return arr;
        
    }
}