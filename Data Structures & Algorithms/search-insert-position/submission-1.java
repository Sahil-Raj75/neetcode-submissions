class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0 , j = nums.length - 1; 
        while(i <= j){
            int mid = i + (j-i)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]){
                j = mid -1;
            }
            if(target > nums[mid]){
                i = mid +1;
            }
        }
        return i;
    }
}