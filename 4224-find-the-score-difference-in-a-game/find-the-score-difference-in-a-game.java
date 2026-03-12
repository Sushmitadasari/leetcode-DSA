class Solution {
    public int scoreDifference(int[] nums) {
       int first=0;
        int second=0;
        boolean fp=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                fp=!fp;
            }
            if(i%6==5){
                fp=!fp;
            }
            if(fp) first+=nums[i];
            else second+=nums[i];
        }
        return first-second; 
    }
}