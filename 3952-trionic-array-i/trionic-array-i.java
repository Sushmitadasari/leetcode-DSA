class Solution {
    public boolean isTrionic(int[] nums) {
        int i=1;
        int n=nums.length;
        while(i<n && nums[i]>nums[i-1]){
            i++;
        }
        if(i==1||i==n) return false;
        while(i<n && nums[i]<nums[i-1]){
            i++;
        }
        if(i==1||i==n) return false;
        while(i<n && nums[i]>nums[i-1]){
            i++;
        }
        if(i==n){
            return true;
        }
        return false;
    }
}