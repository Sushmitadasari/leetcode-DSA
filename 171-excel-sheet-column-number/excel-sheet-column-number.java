class Solution {
    public int titleToNumber(String s) {
        s=s.toUpperCase();
        int tot=0;
        for(char ch:s.toCharArray()){
            tot*=26;
            tot+=ch-'A'+1;
        }
        return tot;
    }
}