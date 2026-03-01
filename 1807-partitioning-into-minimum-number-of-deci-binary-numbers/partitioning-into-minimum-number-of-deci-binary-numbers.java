class Solution {
    public int minPartitions(String n) {
        int dgt=0;
        for(char ch:n.toCharArray()){
            dgt=Math.max(dgt,ch-'0');
            if(dgt==9) return 9;
        }
        return dgt;
    }
}