class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        Arrays.sort(c);
        List<List<Integer>> r = new ArrayList<>();

        new Object() {
            void dfs(List<Integer> cur, int idx, int sum) {
                if (sum == t) {
                    r.add(new ArrayList<>(cur));
                    return;
                }
                for (int i = idx; i < c.length && sum + c[i] <= t; i++) {
                    cur.add(c[i]);
                    dfs(cur, i, sum + c[i]);
                    cur.remove(cur.size() - 1);
                }
            }
        }.dfs(new ArrayList<>(), 0, 0);

        return r;
    }
}
