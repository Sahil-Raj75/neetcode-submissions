class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCountOfOnes = 0, maxi = 0;

        for(int num : nums){
            currCountOfOnes = num == 0 ? 0 : currCountOfOnes+1;
            maxi = Math.max(maxi,currCountOfOnes);
        }
        return maxi;
    }
}