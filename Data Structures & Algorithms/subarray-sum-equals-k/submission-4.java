class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        // agar starting ke subarray me he sum mil jaye tho diff 0 hoga tho kya 0 sum aaya hai pehle; is liye 0 default me he add krna hoga 
        map.put(0,1);
        int left = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            left+= nums[i];

            int diff = left - k;
            if(map.containsKey(diff)){
                count += map.get(diff);
            }
            map.put(left,map.getOrDefault(left,0)+1);

        }
        return count;
    }
}