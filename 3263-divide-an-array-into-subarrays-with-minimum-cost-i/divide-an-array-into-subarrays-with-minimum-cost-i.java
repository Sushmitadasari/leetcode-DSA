class Solution {
    public int minimumCost(int[] nums) {
       int n=nums[0];
       int x=100;
       int y=100;
       for(int i=1;i<nums.length;i++){
           if(nums[i]<x){
            y=x;
            x=nums[i];
           }
           else if(nums[i]<y){
             y=nums[i];
           }
       }
       return n+x+y;
    }
}