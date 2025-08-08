class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> set1=new HashSet<>();
        int maxlen=0;
        int l=0;
        for(int r=0;r<n;r++){
            while(set1.contains(s.charAt(r))){
                set1.remove(s.charAt(l));
                l++;    
            }
            set1.add(s.charAt(r));
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}