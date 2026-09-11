class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()){
            if((ch == ')' || ch == '}' || ch == ']') && stk.isEmpty()){
                return false;
            }
            else if(ch == ')' && stk.peek()=='('){
                stk.pop();
            }
            else if(ch == '}' && stk.peek()=='{'){
                stk.pop();
            }
            else if(ch == ']' && stk.peek()=='['){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }
        return stk.isEmpty() ? true : false;
    }
}