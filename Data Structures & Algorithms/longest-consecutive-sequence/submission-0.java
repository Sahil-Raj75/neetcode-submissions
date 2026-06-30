class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) 
        return 0;
           Arrays.sort(nums);

    int longestSequence = 1;
    int current = 1;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i-1]) {
            continue; // skip the duplicates 
        } else if (nums[i] == nums[i-1] + 1) {
            current++; //for valid sequence
        }
        else { // when sequence break
            longestSequence = Math.max(longestSequence,current);
            current=1;
        }
    }

    longestSequence = Math.max(longestSequence, current);
    return longestSequence;
        
    }
}
