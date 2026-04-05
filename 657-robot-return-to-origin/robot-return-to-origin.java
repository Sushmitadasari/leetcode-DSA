class Solution {
    public boolean judgeCircle(String moves) {
        int ud=0;
        int lr=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U') ud++;
            if(ch=='D') ud--;
            if(ch=='R') lr++;
            if(ch=='L') lr--;
        }
        if(ud==0&&lr==0) return true;
        else return false;
    }
}