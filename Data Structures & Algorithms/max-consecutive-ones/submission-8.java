class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currCount = 0;
        for (int num : nums) {
            currCount = num == 0 ? 0 : currCount + 1;
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }
}