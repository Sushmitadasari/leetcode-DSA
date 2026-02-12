class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int[] freq=new int[26];
        int res=0;
        for(int i=0;i<n;i++){
            Arrays.fill(freq,0);
            for(int j=i;j<n;j++){
                boolean flag=true;
                int c=s.charAt(j)-'a';
                freq[c]++;
                for(int k=0;k<freq.length;k++){
                    if(freq[k]>0&&freq[k]!=freq[c]){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}