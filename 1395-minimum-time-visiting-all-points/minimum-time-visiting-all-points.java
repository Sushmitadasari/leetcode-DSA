class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int ans=0;
        for(int i=0;i<p.length-1;i++){
            ans+=Math.max(Math.abs(p[i+1][0]-p[i][0]),Math.abs(p[i+1][1]-p[i][1]));
        }
        return ans;
    }
}