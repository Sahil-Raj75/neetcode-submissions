class Solution {
    public int removeDuplicates(int[] nums) {
        int writeIndex = 0;
        int readIndex  = 0;

        while(readIndex <nums.length){
            if(nums[writeIndex] == nums[readIndex]){
                readIndex ++;
            }
            else{
                writeIndex++;
                nums[writeIndex] = nums[readIndex];
            }
        }
        return writeIndex+1;
    }
}