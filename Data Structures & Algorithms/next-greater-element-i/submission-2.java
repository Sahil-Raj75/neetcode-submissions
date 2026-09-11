class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            ans[i]=-1;

            boolean found = false;  // value not found 
            for(int j=0;j<nums2.length;j++){
                if(!found && nums1[i]==nums2[j]){ // if(true && a1[i] == a2[j]){ found = true }
                    found= true;
                }
                else if(found && nums2[j]>nums1[i]){ // found true after ai == bj and find first greater after nums1[i]
                    ans[i]=nums2[j];
                    break; // break cuz update to first greater than nums1[i];
                }
            }
        }
        return ans;
    }
}