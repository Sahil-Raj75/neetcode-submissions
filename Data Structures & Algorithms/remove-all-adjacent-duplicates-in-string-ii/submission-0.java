class Pair {
    char ch;
    int count;

    Pair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char strCh = s.charAt(i);

            if (!stk.isEmpty() && stk.peek().ch == strCh) {
                if (stk.peek().count == k - 1) {
                    stk.pop();
                } else {
                    stk.peek().count++;
                }
            } else {
                stk.push(new Pair(strCh, 1));
            }
        }


        StringBuilder sb = new StringBuilder();

        while (!stk.isEmpty()) {
            Pair top = stk.pop();
            while(top.count > 0){
                sb.append(top.ch);
                top.count--;
            }
        }

        return sb.reverse().toString();

    }
}