class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int lo = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0 ;
        for(int hi = 0; hi<nums.length; hi++){
            sum += nums[hi];

            while(sum>=target){
                minLen = Math.min(minLen,hi-lo+1);
                sum-=nums[lo];
                lo++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}