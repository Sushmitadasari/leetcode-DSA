class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        word=word.toLowerCase();
        int vow=0;
        int con=0;
        for(int i=0;i<word.length();i++){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                return false;
            }
            if(Character.isLetter(word.charAt(i))){
                if(word.charAt(i)=='a'|word.charAt(i)=='e'|word.charAt(i)=='i'|word.charAt(i)=='o'|word.charAt(i)=='u'){
                    vow++;
                }
                else{
                    con++;
                }
            }
        }
        if(vow>0&&con>0){
            return true;
        }
        return false;
    }
}