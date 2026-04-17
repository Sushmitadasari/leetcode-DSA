class Solution {
    public boolean isValid(String s) {
         Stack<Character> p =new Stack<>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
               p.push(s.charAt(i));
           }
           else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
              if(p.isEmpty()){
                  return false;
              }
              char top=p.pop();
              if(!Match(top,s.charAt(i))){
                  return false;
              }
           }
       }
           return p.isEmpty();
       }
      private boolean Match(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}