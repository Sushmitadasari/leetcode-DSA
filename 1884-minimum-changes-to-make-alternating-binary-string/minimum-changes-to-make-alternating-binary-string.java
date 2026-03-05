class Solution {
    public int minOperations(String s) {
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++){
            char exp0=(i%2==0)?'0':'1';
            char exp1=(i%2==0)?'1':'0';
            if(s.charAt(i)!=exp0) c1++;
            if(s.charAt(i)!=exp1) c2++;
        }
        return Math.min(c1,c2);
    }
}