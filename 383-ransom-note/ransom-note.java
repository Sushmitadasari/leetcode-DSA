class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char ch:m.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char s:r.toCharArray()){
            if(map1.containsKey(s)&&map1.get(s)>0){
                map1.put(s,map1.get(s)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}