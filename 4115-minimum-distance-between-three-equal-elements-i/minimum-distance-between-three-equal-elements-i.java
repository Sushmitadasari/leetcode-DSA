class Solution {
    public int minimumDistance(int[] arr) {
        int min=Integer.MAX_VALUE;
        int x=min;
        int n=arr.length;
        if(n<3){
            return -1;
        }
        for(int i=0;i<n;i++){
            int absVal=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(int k=j+1;k<n;k++){
                        if(arr[j]==arr[k]){
                             absVal=Math.abs(i - j) + Math.abs(j - k) +
                             Math.abs(k - i);
                            min=Math.min(min,absVal);
                            break;
                        }
                    }
                     break;
                }
            }
        }
        if(min==x){
            return -1;
        }
        return min;
    }
}