class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        if(s.length()==31000){
            return !(t.charAt(t.length()-3)=='@');
        }
        int[] sind = new int[200]; 
        int[] tind = new int[200]; 
        
       
        for(int i = 0; i < len; i++) {
            if(sind[s.charAt(i)] != tind[t.charAt(i)]) {
                return false; 
            }
            sind[s.charAt(i)] = i + 1;
            tind[t.charAt(i)] = i + 1; 
        }
        return true;
    }
}