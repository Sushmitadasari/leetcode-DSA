class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String i : patterns){
            if(word.contains(i)){
                count++;
            }
        }
        return count;
    }

}