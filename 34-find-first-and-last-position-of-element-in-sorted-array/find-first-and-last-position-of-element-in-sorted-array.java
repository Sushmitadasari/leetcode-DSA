class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]  arr = new int[2];
        
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                arr[0]=i;
                break;
            }
            
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                k++;
                break;
            }
        }
        if(k==0){
            arr[0]=arr[1]=-1;
        }
        return arr;
        
    }
}