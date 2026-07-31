class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        
        Arrays.sort(count);
        
        int totalPushes = 0;
        for (int i = 0; i < 26; i++) {
            int freq = count[26 - 1 - i];
            if (freq == 0) break;
            int multiplier = (i / 8) + 1;
            totalPushes += freq * multiplier;
        }
        
        return totalPushes;
    }
}