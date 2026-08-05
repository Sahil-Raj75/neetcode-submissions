class Solution {
    public int majorityElement(int[] nums) {
        Random random = new Random();

        while(true){
            int val = nums[random.nextInt(nums.length)];

            int count = 0;

            for(int num : nums){
                if(num == val){
                    count++;
                }
            }
            if(count > nums.length /2){
                return val;
            }
        }
    }
}