class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];

        for (int i = 1; i <= nums.length; i++) {
            if (map.get(i) != null && map.get(i) == 2) {
                ans[0] = i; // duplicate
            }

            if (map.get(i) == null) {
                ans[1] = i; // missing
            }
        }

        return ans;
    }
}