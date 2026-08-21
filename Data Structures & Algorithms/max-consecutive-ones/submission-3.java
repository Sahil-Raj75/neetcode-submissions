class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCountOfOnes = 0;
        int maxi = 0;

        for(int num : nums){
            if(num == 0){
                currCountOfOnes = 0;
            }
            else{
                currCountOfOnes++;
                maxi = Math.max(maxi,currCountOfOnes);
            }
        }
        return maxi;
    }
}