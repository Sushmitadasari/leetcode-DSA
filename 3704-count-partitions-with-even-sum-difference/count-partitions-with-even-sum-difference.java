class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int rightsum=0;
            int leftsum=0;
            for(int j=0;j<=i;j++){
                leftsum+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                rightsum+=nums[k];
            }
            if((leftsum-rightsum)%2==0){
                count++;
            }
        }
        return count;
    }
}