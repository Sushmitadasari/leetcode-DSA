class Solution {
    public boolean checkOnesSegment(String s) {
        // char[] arr=s.toCharArray();
        // int c=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]=='1'&&(i==0||arr[i-1]=='0')){
        //         c++;
        //     }
        // }
        // if(c<=1) return true;
        // else return false;
        if(s.contains("01")) return false;
        else return true;
    }
}