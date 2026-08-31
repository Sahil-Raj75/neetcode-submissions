class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int[] prefix = new int[n];
        prefix[0] = 0;
        int[] suffix = new int[n];
        suffix[n-1] = 0;

        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        for(int j=n-2; j>=0; j--){
            suffix[j] = suffix[j+1] + nums[j+1];
        }

        for(int k =0; k<n; k++){
            if(prefix[k] == suffix[k]){
                return k;
            }
        }
        return -1;
    }
}