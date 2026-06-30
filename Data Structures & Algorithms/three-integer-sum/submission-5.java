class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
       for(int i =0 ;i<nums.length-2;i++){

        if(i>0 && nums[i]== nums[i-1]){
            continue;
        }

        int a =nums[i];
        int l=i+1 ;
        int r=nums.length -1;
       while(l<r){
        int sum = a + nums[l] +nums[r];
        if(sum>0) r--;
        else if(sum<0) l++;
        else {
            List<Integer> res = Arrays.asList(a,nums[l],nums[r]);
            ans.add(res);
        
        l++;
        r--;
        // while(l<r && nums[l]==nums[l-1]) l++;
        while(l<r && nums[r]==nums[r+1]) r--;
        }
       }
    }
        return new ArrayList<>(ans);
    }
}
