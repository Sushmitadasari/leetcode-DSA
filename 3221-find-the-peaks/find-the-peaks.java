class Solution {
    public List<Integer> findPeaks(int[] mo) {
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<mo.length-1;i++){
            int n=mo[i-1];
            int m=mo[i];
            int o=mo[i+1];
            if(m>n&&o<m){
                res.add(i);
            }
        }
        return res;
    }
}