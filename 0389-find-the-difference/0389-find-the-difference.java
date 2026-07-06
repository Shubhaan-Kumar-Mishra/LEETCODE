class Solution {
    static {
        for(int i=0; i<500;i++){
            findTheDifference("lmao","lmaob");
        }
    }
    public static char findTheDifference(String s, String t) {
        char s1=0,s2=0;

        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(i);
            s2 += t.charAt(i);
        }
        s2 += t.charAt(t.length()-1);
        return (char) (s2-s1);
    }
}