class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> lst=new ArrayList<>();
        String vowels = "aeiouAEIOU";
        String str="";
        for(char i:s.toCharArray()){
            if(vowels.contains(String.valueOf(i)))
            {
                lst.add((int)i);
            }
        }
        int j=0;
        Collections.sort(lst);
        for(char i:s.toCharArray()){
            if(vowels.contains(String.valueOf(i))){
            str+=(char)(int)lst.get(j++);
            }
            else{
                str+=i;            }
        }
        return str;
    }
}