class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = nums2.length -1 ; i>=0; i--){
            while(!stk.isEmpty() && stk.peek()<= nums2[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],stk.peek());
            }
            stk.push(nums2[i]);
        }
        
        int[] ans = new int[nums1.length];
        for(int j = 0; j<nums1.length; j++){
            ans[j] = map.get(nums1[j]);
        }
        
        return ans;
    }
}