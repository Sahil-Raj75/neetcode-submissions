class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        //hiring
        while(high<n){
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
        return res == Integer.MAX_VALUE? 0 : res;
    }
}