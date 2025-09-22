class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=Math.max(count,mp.get(nums[i]));
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(count==mp.get(nums[i])){
                result++;
            }
        }
        return result;
    }
}