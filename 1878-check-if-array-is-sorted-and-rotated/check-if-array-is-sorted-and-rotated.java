class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                c++;
            }
        }
        if (c<=1) return true;
        else return false;
    }
}