class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] ss1 = s1.split(" ");
        String[] ss2 = s2.split(" ");
        HashSet<String> set = new HashSet<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String i : ss1){
            map.put(i,map.getOrDefault(i,0)+1); 
        }
        for(String i : ss2){
            map.put(i,map.getOrDefault(i,0)+1); 
        }
       
        int k = 0;
        for(Map.Entry<String, Integer>m:map.entrySet()){
            if(m.getValue() == 1){
                 set.add(m.getKey());
            }
        }
         String[] fin = new String[set.size()];
        for(String i : set){
            fin[k++] = i;
        }
        return fin;
    }
}