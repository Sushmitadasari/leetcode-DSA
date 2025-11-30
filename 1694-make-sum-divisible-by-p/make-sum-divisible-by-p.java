import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long ts = 0;
        for (int n : nums) {
            ts += n;
        }

        int r = (int)(ts % p);
        if (r == 0) return 0;

        HashMap<Integer, Integer> ps = new HashMap<>();
        ps.put(0, -1);

        int len = nums.length;
        int psum = 0;
        int ml = len;

        for (int i = 0; i < len; i++) {
            psum = (psum + nums[i]) % p;
            if (psum < 0) {
                psum += p;
            }

            int tgt = (psum - r + p) % p;
            if (ps.containsKey(tgt)) {
                ml = Math.min(ml, i - ps.get(tgt));
            }

            ps.put(psum, i);
        }

        return ml == len ? -1 : ml;
    }
}

