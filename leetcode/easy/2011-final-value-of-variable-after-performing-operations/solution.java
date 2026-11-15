class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        for(int i=0;i<op.length;i++){
            String s=op[i];
            if(s.contains("-")){
                x--;
            }
            if(s.contains("+")){
                x++;
            }
        }
        return x;
      
    }
}