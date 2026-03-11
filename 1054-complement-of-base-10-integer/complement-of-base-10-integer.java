class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        String newS = "";

        for(char i : s.toCharArray()){
            if(i == '0'){
                newS += '1';
            }
            else{
                newS += '0';
            }
        }
        return Integer.parseInt(newS,2);
    }
}