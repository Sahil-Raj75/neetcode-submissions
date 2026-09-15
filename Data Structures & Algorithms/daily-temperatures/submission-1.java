class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stk = new Stack<>();
        int[] dailyTemp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && temperatures[i] >= temperatures[stk.peek()]) {
                stk.pop();
            }

            if (stk.isEmpty()) {
                dailyTemp[i] = 0;
            } else {
                dailyTemp[i] = stk.peek() - i;
            }
            stk.push(i);
        }

        return dailyTemp;
    }
}