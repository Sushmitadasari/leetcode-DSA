class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        int broken=0;
        for(String word:arr){
            for(char ch:word.toCharArray()){
                if(brokenLetters.indexOf(ch)!=-1){
                    broken++;
                    break;
                }
            }
        }
        return arr.length-broken;
    }
}