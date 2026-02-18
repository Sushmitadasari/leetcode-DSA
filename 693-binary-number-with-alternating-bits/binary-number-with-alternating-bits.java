class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toString(n,2);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}