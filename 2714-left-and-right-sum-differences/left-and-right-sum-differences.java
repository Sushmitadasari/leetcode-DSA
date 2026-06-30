class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int[] lsum=new int[nums.length];
        int[] rsum=new int[nums.length];
        int r=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
           r+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            r-=nums[i];
            rsum[i]=r;
            lsum[i]=l;
            l=l+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int s=lsum[i]-rsum[i];
            if(s>0){
                ans[i]=s;
            }
            else{
            ans[i]=(-1)*s;
            }
        }
        return ans;
    }
}