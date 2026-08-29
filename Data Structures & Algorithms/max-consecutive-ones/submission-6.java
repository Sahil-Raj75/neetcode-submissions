class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currCount = 0;
        for (int num : nums) {
            if (num == 0) {
                currCount = 0;
            } else {
                currCount++;
            }
            maxCount = Math.max(maxCount, currCount);
            System.out.println(maxCount);
        }
        return maxCount;
    }
}