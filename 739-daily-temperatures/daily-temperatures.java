class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int idx=st.pop();
                res[idx]=i-idx;
            }
            st.push(i);
        }
        return res;
    }
}