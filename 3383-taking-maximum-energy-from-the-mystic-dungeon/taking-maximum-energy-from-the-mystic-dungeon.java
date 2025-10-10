class Solution {
    public int maximumEnergy(int[] arr, int k) {
        int ans=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=n-k;i<n;i++){
            int sum=0;
            for(int j=i;j>=0;j-=k){
                sum+=arr[j];
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
}