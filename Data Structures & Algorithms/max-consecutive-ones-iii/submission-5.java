class Solution {
    public int longestOnes(int[] nums, int k) {
        int lo = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int hi = 0; hi < nums.length; hi++) {
            map.put(nums[hi], map.getOrDefault(nums[hi], 0) + 1);
            
            while (map.getOrDefault(0, 0) > k) {
                map.put(nums[lo], map.get(nums[lo]) - 1);
                if (map.get(nums[lo]) == 0) {
                    map.remove(nums[lo]);
                }
                lo++;
            }

            maxLen = Math.max(maxLen, hi - lo + 1);
        }

        return maxLen;
    }
}