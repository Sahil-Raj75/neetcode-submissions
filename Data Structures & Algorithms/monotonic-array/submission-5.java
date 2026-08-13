class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean monotonicInc = nums[0] <= nums[1] ? true : false;
        for (int i = 0; i < nums.length - 1; i++) {
            // monotone inc
            if (monotonicInc) {
                if (nums[i] <= nums[i + 1]) {
                    continue;
                } else {
                    return false;
                }
            }else{
                if (nums[i] >= nums[i + 1]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}