class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int largest = Integer.MAX_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if(k>0 && nums[i] <= largest){
                largest = nums[i];
                k--;
            }
        }
        return largest;
    }
}