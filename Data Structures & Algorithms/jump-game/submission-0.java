class Solution {
    public boolean canJump(int[] nums) {
        int index = nums.length -1;
        for(int i = index - 1 ; i>=0;i--){
            if(index <= i + nums[i]){
                index = i;
            }
        }
        return index == 0;
    }
}