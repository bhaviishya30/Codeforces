class Solution {
    public String defangIPaddr(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='.'){
                 str.append("[.]");
                continue;
            }
            str.append(s.charAt(i));   
        }
        String st = str.toString();
        return st;

        
    }
}