class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stk.isEmpty() && nums[stk.peek()] <= nums[i]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = stk.peek() - i ;
            }
            stk.push(i);
        }

        return ans;
    }
}