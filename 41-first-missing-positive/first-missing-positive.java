class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr=Arrays.stream(nums).filter(n -> n>0).toArray();
        int x=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                x++;
            }
            else if(arr[i]>x){
                return x;
            }
        }
        return x;
    }
}