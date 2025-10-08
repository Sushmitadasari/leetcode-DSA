class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       int[] arr=new int[friends.length];
        int k=0;
        for(int i=0;i<order.length;i++){
            int num=order[i];
            for(int j=0;j<friends.length;j++){
                if(num==friends[j]){
                    arr[k]=num;
                    k++;
                }
            }
        }
        return arr;
    }
}