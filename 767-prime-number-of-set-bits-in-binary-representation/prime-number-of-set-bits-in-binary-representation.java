class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for (int i = left; i <= right; i++) {
            int bits = Integer.bitCount(i);
            System.out.println(bits);
            if (isPrime(bits)) {
                c++;
            }
        }
        return c;
    }
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}