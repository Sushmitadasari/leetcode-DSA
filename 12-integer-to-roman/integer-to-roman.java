class Solution {
    public String intToRoman(int num) {
        final int[] val={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        final String[] roman={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder st=new StringBuilder();
        for(int i=val.length-1;i>=0;i--){
            if(num==0) break;
            while(num>=val[i]){
                st.append(roman[i]);
                num-=val[i];
            }
        }
        return st.toString();
    }
}