class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;

        // ArrayList<Integer> arr =new ArrayList<>();
        int[] arr = new int[nums.length];
        int k = nums.length-1;
        while(l<=r){
            int left = nums[l] * nums[l];
        int right = nums[r] * nums[r];
        
            if(left>right){
                arr[k] = left;
                l++;
            }
            else {
                arr[k]= right;
                r--;
            }
            k--;
        }
        return arr;
    }
}