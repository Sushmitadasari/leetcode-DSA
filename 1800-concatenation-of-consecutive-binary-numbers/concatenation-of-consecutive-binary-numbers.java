class Solution {
    public int concatenatedBinary(int n) {
        StringBuilder s=new StringBuilder();
        for(int i=1;i<=n;i++){
            s.append(Integer.toBinaryString(i));
        }
        String str=s.toString();
        long num=0;
        int mod=1000000007;
        for(int i=0;i<str.length();i++){
             num=(num*2+(str.charAt(i)-'0'))%mod;
        }
        return (int) num;
    }
}