class Solution {
    public long zeroFilledSubarray(int[] arr) {
        long count=0;
        long consecutive=0;
        for(long num :arr){
            if(num==0){
                consecutive++;
                count+=consecutive;
            }
            else{
                consecutive=0;
            }
        }
        return count;
    }
}