class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int st=1;
        int total=0;
        for(int i=cost.length-1;i>=0;i--){
            if(st%3!=0){
                total+=cost[i];
            }
            st++;
        }
        return total;
    }
}