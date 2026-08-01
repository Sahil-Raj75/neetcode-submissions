class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = -1;
        int j = -1;

        for (int x = 0; x < nums.length; x++) {
            if(i == -1 && nums[x] == target){
                i = x;
            }
            if(nums[x] == target) {
                j = x;
            }
        }
        return new int[]{i,j};
    }
}