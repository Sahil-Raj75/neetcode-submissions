class Solution {
    public boolean isMonotonic(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            // monotone inc
            if (nums.length > 0 && nums[0] <= nums[1]) {
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