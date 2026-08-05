class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int res = nums[nums.length/2];
        return res;
    }
}