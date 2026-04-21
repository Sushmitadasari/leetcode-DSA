class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;
        while(n > 0){
            int temp = n%10;
            p *= temp;
            s += temp;
            n/=10;
        }
        return p - s;
    }
}