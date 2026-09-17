class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int lo = 0;
        int maxLen = Integer.MAX_VALUE;
        int sum = 0;

        // hire with high
        for(int hi = 0; hi<nums.length; hi++){
            sum += nums[hi];
            while(sum >= target){
                int currLen = hi - lo + 1;
                maxLen = Math.min(currLen,maxLen);
                sum -= nums[lo];
                lo++;
            }
        }
        return maxLen == Integer.MAX_VALUE ? 0 : maxLen;
    }
}