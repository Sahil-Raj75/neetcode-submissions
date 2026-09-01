class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s){
            stk.push(ch);
        }
        for(int i=0;i<s.length;i++){
            s[i] = stk.pop();
        }
    }
}