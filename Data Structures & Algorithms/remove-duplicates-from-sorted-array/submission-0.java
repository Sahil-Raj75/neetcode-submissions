class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0 , r = 1;
        while(r<nums.length){
            if(nums.length == 0) return 0;
            else if(nums[r] == nums[l]){
                r++;
            }
            else{
                l++;
                nums[l]=nums[r];
            }
        }
        return l+1;
    }
}