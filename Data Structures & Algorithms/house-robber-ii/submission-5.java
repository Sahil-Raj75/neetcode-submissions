class Solution {
    public int rob(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int[] skiplast = new int[nums.length-1];
        int[] skipfirst = new int[nums.length-1];

        for(int i=0;i<nums.length-1 ; i++){
            skiplast[i]=nums[i];
            skipfirst[i]=nums[i+1];
        }

        return Math.max(robhelper(skiplast),robhelper(skipfirst));
    }

    private int robhelper(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] arr = new int[nums.length];
            arr[0]=nums[0];
            arr[1]=Math.max(nums[0],nums[1]);
        for(int i=2 ; i<nums.length; i++){
            arr[i]= Math.max(nums[i]+arr[i-2],arr[i-1]);
        }
        return arr[arr.length-1];
    }
}
