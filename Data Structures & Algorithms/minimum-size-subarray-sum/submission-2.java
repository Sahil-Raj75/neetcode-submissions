class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        while(high<n && sum<target){
            sum += nums[high];
            // firing work
            while(sum>=target){
                int len = high - low +1;
                res = Math.min(len,res);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        if(high-low == n && sum<target){
            return 0;
        }
        return res;
    }
}