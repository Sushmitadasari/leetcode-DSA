class Solution {
    public int minElement(int[] nums) {
        int min=nums [0];
    for (int i=0;i<nums.length;i++){
    int sum=0;
    while(nums [i]!=0){
    int temp=nums[i]%10; 
    sum+=temp; 
    nums [i]/=10;
    }
    if (min>sum){
    min=sum;  
   }
}
   return min;
}
}